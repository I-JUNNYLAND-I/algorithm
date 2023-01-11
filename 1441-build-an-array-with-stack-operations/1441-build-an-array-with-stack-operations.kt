class Solution {
fun buildArray(a: IntArray, n: Int): List<String> {
    val l = mutableListOf<String>()
    var j = 0
    for (i in 1..n) {
        l.add("Push")
        if (a[j] != i) l.add("Pop") else if (j != a.lastIndex) j++ else return l
    }
    return l
}
}