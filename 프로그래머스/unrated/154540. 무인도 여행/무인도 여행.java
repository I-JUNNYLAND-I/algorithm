import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(String[] maps) {
        int row = maps.length;
        int col = maps[0].length();
        boolean[][] isVisited = new boolean[row][col];
        char[][] maps_ = Arrays.stream(maps).map(String::toCharArray).toArray(char[][]::new);
        List<Integer> result = new ArrayList<>();
        for (int i  = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                List<Integer> island = new ArrayList<>();
                dfs(maps_, isVisited,i,j, island);
                if (!island.isEmpty()) result.add(island.stream().reduce(0, Integer::sum));
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

    private void dfs(char[][] maps, boolean[][] isVisited, int row, int col, List<Integer> island) {
        if (row < 0 || maps.length <= row || col < 0 || maps[0].length <= col) return;
        if (maps[row][col] == 'X') return;
        if (!isVisited[row][col]) {
            isVisited[row][col] = true;
            island.add((int)(maps[row][col] - 48));
            dfs(maps, isVisited, row - 1, col, island);
            dfs(maps, isVisited, row, col - 1, island);
            dfs(maps, isVisited, row + 1, col, island);
            dfs(maps, isVisited, row, col + 1, island);
        }
    }
}