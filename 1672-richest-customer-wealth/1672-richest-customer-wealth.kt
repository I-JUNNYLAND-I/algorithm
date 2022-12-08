class Solution {
fun maximumWealth(accounts: Array<IntArray>): Int {
    var max = 0
    accounts.forEach {
        var reesult = it.sum();
        if (reesult > max) {
            max = reesult
        }
    }
    return max
}
}