class Solution {
    fun groupThePeople(groupSizes: IntArray): List<List<Int>> {
        val ans = mutableListOf<List<Int>>()
        var sortedBy = IntRange(0, groupSizes.size-1)
            .map { Group(it, groupSizes[it]) }
            .sortedBy { it.value }
        while (sortedBy.isNotEmpty()){
            val count = sortedBy[0]
            ans.add(sortedBy.subList(0,count.value).map { it.idx })
            sortedBy = sortedBy.subList(count.value,sortedBy.size)
        }
        return ans
    }
}

data class Group(
    val idx: Int,
    val value: Int
)