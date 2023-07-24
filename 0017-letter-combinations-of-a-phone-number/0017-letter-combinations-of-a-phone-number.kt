class Solution {
    private companion object{
        private val phonePad = arrayOf("", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz")
    }
    
    fun letterCombinations(digits: String): List<String> {
	    // not used
        // val lenD = digits.length
		
        val ans = ArrayList<String>()
        if(digits.isEmpty()) return ans
        
        val builder = StringBuilder()
        dfs(0, digits, builder, ans)
        return ans
    }
    
    private fun dfs(idx: Int, digits: String, builder: StringBuilder, res: ArrayList<String>){
        val len = digits.length
        if(idx == len) {
            res.add(builder.toString())
            return
        }
        
        val candidates = phonePad[digits[idx] - '0']
        
        for(ch in candidates){
            builder.append(ch)
            dfs(idx + 1, digits, builder, res)
            builder.deleteCharAt(builder.length - 1)
        }
    }
}