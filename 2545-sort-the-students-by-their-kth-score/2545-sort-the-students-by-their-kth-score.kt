class Solution {
    fun sortTheStudents(score: Array<IntArray>, k: Int): Array<IntArray> {

        val temp = mutableMapOf<Int, IntArray>()
        
        score.forEach { 
            val key = it[k]
            temp[key] = it
        }

        val sorted = temp.entries.sortedBy { it.key }.reversed()

        val result = mutableListOf<IntArray>()
        
        sorted.forEach { 
            result.add(it.value)
        }
        
        
        
        
        return result.toTypedArray()
    }
}