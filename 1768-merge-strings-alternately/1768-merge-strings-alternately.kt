class Solution {
fun mergeAlternately(word1: String, word2: String): String {
    var result = ""
    var i = 0
    var j = 0
    while (i < word1.length && j < word2.length) {
        result += word1[i++]
        result += word2[j++]
    }
    while (i < word1.length) {
        result += word1[i++]
    }
    while (j < word2.length) {
        result += word2[j++]
    }
    return result
}
}