class Solution {
    fun maxDepth(s: String): Int {
        var maxD = 0
        var currD = 0
        s.forEach {
            if (it == '(') {
                currD++
                maxD = Math.max(maxD, currD)
            } else if (it == ')') {
                currD--
            }
        }
        
        return maxD
    }
}