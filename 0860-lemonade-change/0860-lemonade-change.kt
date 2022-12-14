class Solution {
fun lemonadeChange(bills: IntArray): Boolean {
    var five = 0
    var ten = 0
    for (bill in bills) {
        when (bill) {
            5 -> five++
            10 -> {
                if (five == 0) return false
                five--
                ten++
            }
            else -> {
                if (five > 0 && ten > 0) {
                    five--
                    ten--
                } else if (five >= 3) {
                    five -= 3
                } else {
                    return false
                }
            }
        }
    }
    return true
}
}