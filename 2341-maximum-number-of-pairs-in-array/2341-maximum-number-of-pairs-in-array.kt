class Solution {
fun numberOfPairs(a: IntArray) = a.toList().groupingBy { it }.eachCount().values.run {
    intArrayOf(
        reduce { s, n -> if (n % 2 == 0) s + n else s + (n - 1) } / 2,
        count { it % 2 == 1 }
    )
}
}