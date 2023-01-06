class Solution {
    fun finalPrices(prices: IntArray): IntArray {
        val stack = ArrayDeque<Int>()

        for (i in 0..prices.size - 1) {
            while (stack.isNotEmpty() && prices[stack.last()] >= prices[i]) {
                prices[stack.removeLast()] -= prices[i]
            }
            stack.addLast(i)
        }

        return prices
    }
}