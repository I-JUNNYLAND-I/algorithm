class Solution {
    fun restoreString(s: String, indices: IntArray): String {
        
        var answer = ""
        
        for (i in indices.indices) {
            for (j in indices.indices) {
                if (indices[j] == i) {
                    answer += s[j]
                }
            }
        }
        
        return answer
    }
}