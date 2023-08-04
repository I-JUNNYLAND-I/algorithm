class Solution {
    fun maxIceCream(costs: IntArray, coins: Int): Int {
        var count =0
        var coin = coins
        costs.sorted().forEach {
            if(coin-it >=0){
                count+=1
                coin-=it
            }
        }
        return count
    }
}