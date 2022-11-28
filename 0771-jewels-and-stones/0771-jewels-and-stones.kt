class Solution {
    fun numJewelsInStones(jewels: String, stones: String): Int {
            var sum = 0;

    val split = jewels.split("").forEach { e ->
        val replace = stones.replace(e, "")
        sum += stones.length - replace.length
    }
    return sum
    }
}