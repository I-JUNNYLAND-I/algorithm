class Solution {
    int MATRIX_SIZE = 0;
    public int minFallingPathSum(int[][] matrix) {
        MATRIX_SIZE = matrix.length;
        int min = Integer.MAX_VALUE;
        int[][] memo = new int[MATRIX_SIZE][MATRIX_SIZE];
        for (int i = 0; i < MATRIX_SIZE; i++) {
            min = Math.min(min, helper(matrix, memo, 0, i));
        }
        return min;
    }
    public int helper(int[][] matrix, int[][] memo, int row, int col) {
        if (col < 0 || col >= MATRIX_SIZE) {
            return 1_000_000_007;
        }
        if (MATRIX_SIZE - 1 == row) {
            return matrix[row][col];
        }
        if (memo[row][col] != 0) {
            return memo[row][col];
        }
        int leftDown = helper(matrix, memo, row + 1, col - 1);
        int midDown = helper(matrix, memo, row + 1, col);
        int rightDown = helper(matrix, memo, row + 1, col + 1);
        memo[row][col] = matrix[row][col] + Math.min(leftDown, Math.min(midDown, rightDown));  
        return memo[row][col];  
    }
}