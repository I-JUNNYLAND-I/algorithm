class Solution {
fun countBalls(lowLimit: Int, highLimit: Int): Int {
    val map = mutableMapOf<Int, Int>()
    for (i in lowLimit..highLimit) {
        val sum = i.toString().map { it.toString().toInt() }.sum()
        map[sum] = map.getOrDefault(sum, 0) + 1
    }
    return map.values.max()!!
}
}