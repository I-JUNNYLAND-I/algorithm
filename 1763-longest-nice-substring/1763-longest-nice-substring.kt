class Solution {
fun longestNiceSubstring(s: String): String {
    var pointer = 0
    var longest = ""
    while (pointer < s.length) {
        var current = ""
        for (i in pointer until s.length) {
            current += s[i]
            if (current.length > longest.length && isNice(current)) {
                longest = current
            }
        }
        pointer++
    }
    return longest
}

fun isNice(s: String): Boolean {
    for (i in s.indices) {
        if (s[i].isUpperCase() && !s.contains(s[i].toLowerCase())) {
            return false
        }
        if (s[i].isLowerCase() && !s.contains(s[i].toUpperCase())) {
            return false
        }
    }
    return true
}
}