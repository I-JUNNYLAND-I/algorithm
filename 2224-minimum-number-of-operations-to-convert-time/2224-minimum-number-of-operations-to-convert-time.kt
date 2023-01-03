class Solution {
    fun convertTime(current: String, correct: String): Int {
        val minutes1 = current.split(":")[0].toInt() * 60 + current.split(":")[1].toInt()        
        val minutes2 = correct.split(":")[0].toInt() * 60 + correct.split(":")[1].toInt()
        
        val diff = minutes2 - minutes1
        
        if (diff == 0) return 0
        
        val hourModulo = diff % 60
        val quarterModulo = diff % 60 % 15
        
        var operations = diff / 60
        operations += hourModulo / 15
        operations += quarterModulo / 5
        operations += quarterModulo % 5
        
        return operations
    }
}