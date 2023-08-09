class Solution {
    fun groupThePeople(groupSizes: IntArray): List<List<Int>> {

        var groups = mutableMapOf<Int, MutableList<Int>>()
        
        val answer = mutableListOf<List<Int>>()
        
        for (i in groupSizes.indices) {
            val groupSize = groupSizes[i]
            if (groupSizes[i] == 1) {
                answer.add(listOf(i))
                continue
            }
            if (groups.containsKey(groupSize)) {
                val group = groups[groupSize]!!
                group.add(i)
                if (group.size == groupSize) {
                    answer.add(group)
                    groups.remove(groupSize)
                }
            } else {
                groups[groupSize] = mutableListOf(i)
            }
        }
        
        return answer
    }
}