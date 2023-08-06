class Solution {
    fun maxIceCream(costs: IntArray, coins: Int): Int {

        var answer = 0
        var temp = coins
        costs.sorted().forEach {
            if (temp >= it) {
                temp -= it
                answer++
            }
        }


        return answer
    }
}