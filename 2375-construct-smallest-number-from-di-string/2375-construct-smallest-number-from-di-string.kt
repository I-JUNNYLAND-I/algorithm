class Solution {
    fun smallestNumber(pattern: String): String {
        val res = StringBuilder()
        var temp = StringBuilder()
        var ch = '1'
        for (i in 0 until pattern.length) {
            val cur = pattern[i]
            temp.append(ch++)
            if (cur == 'I') {
                res.append(temp.reverse())
                temp = StringBuilder()
            }
        }
        temp.append(ch++)
        res.append(temp.reverse())
        return res.toString()
    }
}