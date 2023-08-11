class Solution {
fun partitionLabels(s: String): List<Int> {
    val list = mutableListOf<Int>()
    var counter = 0
    var j = 0
    s.forEachIndexed { i, _ ->
        ++counter
        if (s.substring(j..i).none { s.substring(i + 1).contains(it) }) {
            list.add(counter)
            counter = 0
            j = i
        }
    }
    return list
}
}