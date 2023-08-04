class Solution {
   fun minDeletionSize(strs: Array<String>): Int {
        val cols :Array<Array<Char>> =  Array(strs[0].length) { Array(strs.size) { ' ' } }
        strs.forEachIndexed { i, it ->
            it.forEachIndexed { j, c ->
                cols[j][i] = c
             }
        }
        var res = 0
        cols.forEach {
            if (!it.sortedArray().contentEquals(it)) res++
        }
        return res
    }
}