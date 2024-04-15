class Solution {
    fun findMatrix(nums: IntArray): List<List<Int>> {
        val map = HashMap<Int, Int>()
        nums.forEach { map[it] = map.getOrDefault(it, 0) + 1 }
        val result = mutableListOf<List<Int>>()
        for(i in 0 until map.values.max()!!) {
            val list = mutableListOf<Int>()
            map.forEach { (key, value) ->
                if (value > i) {
                    list.add(key)
                }
            }
            if (list.size > 0) {
                result.add(list)
            }
        }
        return result
    }
}