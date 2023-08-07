class Solution {
    fun maxIceCream(costs: IntArray, coins: Int): Int {
        costs.sort()

        var now = coins
        var count = 0
        for(cost in costs){
            if (now >= cost){
                now -= cost
                count++
            }
        }
        return count
    }
}