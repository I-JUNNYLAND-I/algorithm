class Solution {
    fun bestHand(ranks: IntArray, suits: CharArray): String {
        if ((1..4).all { suits[it] == suits[it-1] })
            return "Flush"
        
        val ranksCountMap = IntArray(13) { 0 }
        
        ranks.forEach {
            ranksCountMap[it-1] = ranksCountMap[it-1] + 1
        }
        
        return if (ranksCountMap.any { it >= 3 }) "Three of a Kind"
                else if (ranksCountMap.any { it == 2 }) "Pair"
                else "High Card"
    }
}