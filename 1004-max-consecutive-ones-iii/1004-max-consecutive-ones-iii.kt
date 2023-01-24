class Solution {
    fun longestOnes(A: IntArray, K: Int): Int {
        if (A.isEmpty() || K < 0)   return 0
        var result = 0
        var zeros = 0
        var start = 0

        A.forEachIndexed { i, num ->          
            if (num == 0) {
                zeros++
            }
            if (zeros > K) {
                if (A[start] == 0) {
                    zeros--
                }
                start++
            }

            result = maxOf(result, i - start + 1)
        }
        return result
    }
}