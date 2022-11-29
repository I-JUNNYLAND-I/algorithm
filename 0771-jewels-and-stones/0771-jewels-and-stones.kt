class Solution {
    fun numJewelsInStones(jewels: String, stones: String): Int {
        return stones.count() { jewels.contains(it) }
    }
}