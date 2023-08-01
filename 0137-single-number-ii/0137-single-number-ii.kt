class Solution {
    fun singleNumber(nums: IntArray): Int {
        val map = mutableMapOf<Int,Int>()
        nums.forEach {
            val orDefault = map.getOrDefault(it, 0)
            map[it] = orDefault+1
        }
        map.keys.forEach{
            if (map[it] !=3)
                return it
        }
        return 0
    }
}