class Solution {
fun isUgly (num: Int): Boolean {
    var n = num
    intArrayOf(2, 3, 5).forEach {
        while (n % it == 0 && n != 0) n /= it
    }
    return n == 1
}
}