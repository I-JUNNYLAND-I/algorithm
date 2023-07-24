class Solution {
    companion object{
        val keymap: Map<Char, List<String>> = mapOf(
            '2' to listOf("a","b","c"),
            '3' to listOf("d","e","f"),
            '4' to listOf("g","h","i"),
            '5' to listOf("j","k","l"),
            '6' to listOf("m","n","o"),
            '7' to listOf("p","q","r","s"),
            '8' to listOf("t","u","v"),
            '9' to listOf("w","x","y","z")
        )
    }

    fun letterCombinations(digits: String): List<String> {
        val answer: MutableList<String> = mutableListOf()
        if(digits == "")
            return emptyList()
        dfs(digits,0,"", answer)
        return answer
    }

    private fun dfs(digits: String, depth: Int, data: String, answer: MutableList<String>) {
        if(depth == digits.length){
            answer.add(data)
        }else{
            keymap[digits[depth]]?.forEach{
                dfs(digits, depth+1, data+it, answer)
            }
        }
    }
}