class Solution {
fun balancedStringSplit(s: String): Int {
    var count = 0
    var balance = 0
    for (c in s) {
        if (c == 'L') {
            balance++
        } else {
            balance--
        }
        if (balance == 0) {
            count++
        }
    }
    return count
}
}