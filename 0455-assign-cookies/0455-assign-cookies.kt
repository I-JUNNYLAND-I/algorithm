class Solution {
fun findContentChildren(g: IntArray, s: IntArray): Int {
    g.sort()
    s.sort()
    var i = 0
    var j = 0
    while (i < g.size && j < s.size) {
        if (g[i] <= s[j]) {
            i++
        }
        j++
    }
    return i
}
}