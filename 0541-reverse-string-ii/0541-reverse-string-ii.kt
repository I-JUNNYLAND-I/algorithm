class Solution {
fun reverseStr(s: String, k: Int): String {
    var str = s
    var i = 0
    while (i < str.length) {
        if (i + k < str.length) {
            str = str.substring(0, i) + str.substring(i, i + k).reversed() + str.substring(i + k)
        } else {
            str = str.substring(0, i) + str.substring(i).reversed()
        }
        i += 2 * k
    }
    return str
}
}