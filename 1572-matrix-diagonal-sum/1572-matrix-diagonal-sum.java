class Solution {

    public int diagonalSum(int[][] mat) {

        int answer = 0;

        if (mat.length % 2 == 0) {
            for (int i = 0; i < mat.length; i++) {
                answer += mat[i][i];
            }
            for (int i = 0; i < mat.length; i++) {
                answer += mat[i][mat.length - i - 1];
            }
        } else {
            for (int i = 0; i < mat.length; i++) {
                answer += mat[i][i];
            }
            for (int i = mat.length - 1; i >= 0; i--) {
                answer += mat[i][mat.length - i - 1];
            }
            answer -= mat[mat.length / 2][mat.length / 2];
        }

        return answer;
    }


}