class Solution {
    val arr = mutableListOf<String>()

    fun getHappyString(n: Int, k: Int): String {
        dfs(n,"")
        return arr.getOrNull(k-1) ?: ""
    }

    private fun dfs(n: Int, word: String) {
        if (n == 0) {
            arr.add(word)
            return
        }

        for(i in chars.indices){
            if (word.isEmpty() || word[word.length - 1] != chars[i]) {
                dfs( n-1, word+chars[i])
            }
        }
    }

    companion object {
        val chars = arrayOf('a', 'b', 'c')
    }
}
