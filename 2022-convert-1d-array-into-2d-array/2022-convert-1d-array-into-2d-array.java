class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) return new int[][]{};
        int[][] answer = new int[m][n];
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                answer[row][col] = original[n * row + col];
            }
        }
        return answer;
    }
}