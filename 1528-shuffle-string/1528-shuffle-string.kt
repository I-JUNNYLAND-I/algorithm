class Solution {
    fun restoreString(s: String, indices: IntArray): String {
        val ans: Array<Char> = Array(indices.size) { ' ' }
        indices.forEachIndexed { index, i ->
            ans[i] = s.get(index)
        }
        return ans.joinToString("")
    }
}