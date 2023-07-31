class Solution {
    fun partitionString(s: String): Int {
        var counter = 0
        val set = HashSet<Char>()
        for (char in s) {
            if (set.contains(char)) {
                set.clear()
                counter++
            }
            set.add(char)
        }
        return counter + 1
    }
}