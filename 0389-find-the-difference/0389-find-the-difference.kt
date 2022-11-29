class Solution {
fun findTheDifference(s: String, t: String): Char {
    var rubble = t[t.length - 1]

    for (i in s.indices) {
        rubble += t[i].toInt() 
        rubble -= s[i].toInt()
    }

    return rubble
}
}