class Solution {
fun minAddToMakeValid(s: String): Int {
    var left = 0
    var right = 0
    var count = 0
    s.forEach {
        if (it == '(') {
            left++
        } else {
            right++
        }
        if (right > left) {
            count++
            right--
        }
    }
    return count + left - right
}
}