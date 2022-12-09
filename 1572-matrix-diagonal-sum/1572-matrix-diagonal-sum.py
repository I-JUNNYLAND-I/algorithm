class Solution:
    def diagonalSum(self, mat: List[List[int]]) -> int:
        j = len(mat) - 1
        count = 0
        for i in range(len(mat)):
            print(i, j)
            count += mat[i][i] + mat[i][j - i]
        return count if len(mat) % 2 == 0 else count - mat[int(j/2)][int(j/2)] 