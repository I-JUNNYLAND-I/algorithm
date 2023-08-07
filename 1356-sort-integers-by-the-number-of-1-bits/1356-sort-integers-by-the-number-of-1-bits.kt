class Solution {
    fun sortByBits(arr: IntArray): IntArray {
        return arr.sortedWith(compareBy({Integer.bitCount(it)}, {it})).toIntArray()
    }
}