class Solution {
    fun fillCups(amount: IntArray): Int {
        amount.sort()
        
        var counter = 0
        
        while (amount[1] > 0) {
            amount[1] = amount[1] - 1
            amount[2] = amount[2] - 1
            counter++
            
            amount.sort()
        }
        
        return counter + amount[2]
    }
}