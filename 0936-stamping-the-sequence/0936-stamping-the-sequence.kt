class Solution {
    fun movesToStamp(stamp: String, target: String): IntArray {
        val res = LinkedList<Int>()  
        var chrs = target.toCharArray()
        var changed = false
        do {
            changed = false
            for (i in 0..(chrs.lastIndex-stamp.lastIndex)) {
                var isEqual = true
                var count = 0
                for (j in 0..stamp.lastIndex) {
                    if (chrs[i+j] == '*') count++
                    if (stamp[j] != chrs[i+j] && chrs[i+j] != '*') {
                        isEqual = false
                        break
                    }
                }
                if (isEqual && count < stamp.length) {
                    chrs.fill('*', i, i + stamp.length)
                    res.addFirst(i)
                    changed = true
                }
            }
        } while (changed)
        
        if (chrs.any { it != '*' }) return intArrayOf()

        return res.toIntArray()
    }
}