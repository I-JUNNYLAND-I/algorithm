class Solution {
    companion object {
        var TABLE = arrayOf("", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz")
    }

    fun letterCombinations(digits: String?): List<String> {
        val result: MutableList<String> = ArrayList()
        if (digits.isNullOrEmpty()) {
            return result
        }
        dfs(digits, 0, StringBuilder(), result)
        return result
    }

    private fun dfs(digits: String, index: Int, stringBuilder: StringBuilder, result: MutableList<String>) {
        if (index == digits.length) {
            result.add(stringBuilder.toString())
            return
        }
        val letters = TABLE[digits[index] - '0']
        for (element in letters) {
            stringBuilder.append(element)
            dfs(digits, index + 1, stringBuilder, result)
            stringBuilder.deleteCharAt(stringBuilder.length - 1)
        }
    }
}