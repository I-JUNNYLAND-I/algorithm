class Solution {
    fun diStringMatch(S: String): IntArray {
        val N = S.length
        val result = IntArray(N + 1)
        var i = 0
        var d = N
        
        for (k in S.indices) {
            result[k] = if (S[k] == 'I') i++ else d--
        }
        result[N] = d--
        
        return result
    }
}