class Solution {
fun countConsistentStrings(allowed: String, words: Array<String>): Int {
    var count = 0
    for (word in words) {
        var isConsistent = true
        for (c in word) {
            if (!allowed.contains(c)) {
                isConsistent = false
                break
            }
        }
        if (isConsistent) {
            count++
        }
    }
    return count
}
}