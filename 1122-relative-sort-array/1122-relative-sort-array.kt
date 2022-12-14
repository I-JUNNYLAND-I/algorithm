class Solution {
fun relativeSortArray(arr1: IntArray, arr2: IntArray): IntArray {
        val map = HashMap<Int, Int>()
        arr1.forEach {
            map[it] = map.getOrDefault(it, 0) + 1
        }
        val result = IntArray(arr1.size)
        var index = 0
        arr2.forEach {
            val count = map[it]!!
            for (i in 0 until count) {
                result[index++] = it
            }
            map.remove(it)
        }
        val keys = map.keys.sorted()
        keys.forEach {
            val count = map[it]!!
            for (i in 0 until count) {
                result[index++] = it
            }
        }
        return result
    }
}