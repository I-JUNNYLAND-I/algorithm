import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(String[] maps) {
        int row = maps.length;
        int col = maps[0].length();
        // 재 방문 확인용 boolean 타입 배열
        boolean[][] isVisited = new boolean[row][col];
        // 1차원 문자열 배열로 주어진 input을 2차원 문자 배열로 전환
        char[][] maps_ = Arrays.stream(maps)
							.map(String::toCharArray)
							.toArray(char[][]::new);
        List<Integer> result = new ArrayList<>();
        for (int i  = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
	            // 연결된 섬들의 숫자를 기억하기 위한 리스트
                List<Integer> islands = new ArrayList<>();
                // 탐색을 통해 연결된 섬을 방문
                dfs(maps_, isVisited, i, j, islands);
                if (!islands.isEmpty()) {
	                // 섬들의 숫자 합을 reduce 연산을 통해 합연산
	                int sum = islands.stream()
					                .reduce(0, Integer::sum);
	                result.add(sum);
                } 
            }
        }
        int size = result.size();
        if (size == 0) return new int[]{-1};
        int[] answer = new int[size];
        for (int k = 0; k < result.size(); k++) {
            answer[k] = result.get(k);
        }
        Arrays.sort(answer);
        return answer;
    }

    private void dfs(char[][] maps, boolean[][] isVisited, int row, int col, List<Integer> islands) {
	    // indexOutOfRange 탐색종료
        if (row < 0 || maps.length <= row || col < 0 || maps[0].length <= col) return;
        // 섬이 아닌 곳 방문시 탐색 종료
        if (maps[row][col] == 'X') return;
        if (!isVisited[row][col]) {
	        // 방문한 위치 마킹 
            isVisited[row][col] = true;
            // ASCII code 에서 '0'의 값 48
            islands.add((int)(maps[row][col] - 48));
            dfs(maps, isVisited, row - 1, col, islands);
            dfs(maps, isVisited, row, col - 1, islands);
            dfs(maps, isVisited, row + 1, col, islands);
            dfs(maps, isVisited, row, col + 1, islands);
        }
    }
}