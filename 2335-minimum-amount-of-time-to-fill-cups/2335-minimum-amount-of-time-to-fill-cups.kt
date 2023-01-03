class Solution {
    fun fillCups(amount: IntArray): Int {

        amount.sortDescending()

        return when {
            amount[0] >= amount[1] + amount[2] -> amount[0]
            amount[0] < amount[1] + amount[2] -> {
                var answer:Int = 0
                while (amount[0] != 0) {
                    amount[0]--
                    amount[1]--
                    amount.sortDescending()
                    answer++
                }
                return answer
            }
            else -> {0}
        }
    }
}
