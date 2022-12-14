class Solution {
fun uniqueOccurrences(arr: IntArray): Boolean {
    val map = mutableMapOf<Int, Int>()
    arr.forEach {
        map[it] = map.getOrDefault(it, 0) + 1
    }
    return map.size == map.values.toSet().size

}
}