class Solution {
    fun groupThePeople(groupSizes: IntArray): List<List<Int>> {
        val map = mutableMapOf<Int, MutableList<Int>>()
        val ans = mutableListOf<List<Int>>()
        groupSizes.forEachIndexed { idx, it ->
            var default = map.getOrDefault(it, mutableListOf()).also { it.add(idx) }
            if (default.size == it){
                ans.add(default)
                default = mutableListOf()
            }
            map[it] = default
        }
        return ans
    }
}