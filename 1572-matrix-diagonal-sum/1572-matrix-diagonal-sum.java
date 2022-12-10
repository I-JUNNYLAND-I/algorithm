class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int size = mat.length;
        int row = 0;
        int col = 0;
        while(row < size) {
            sum += mat[row][col];
            sum += mat[row][size - col - 1];
            row++;
            col++;
        }
        if (size % 2 != 0) {
            sum -= mat[size/2][size/2];
        }
        return sum;
    }
}