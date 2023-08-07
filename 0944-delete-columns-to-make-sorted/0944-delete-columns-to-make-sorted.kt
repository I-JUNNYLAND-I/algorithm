class Solution {
    fun minDeletionSize(strs: Array<String>): Int =
        (0 until strs[0].length).count { i ->
            (0 until strs.lastIndex).any { j ->
                strs[j][i] > strs[j + 1][i]
            }
        }
}