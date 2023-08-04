class Solution {
    fun sortByBits(arr: IntArray): IntArray {
        return arr.sorted().sortedWith(compareBy { it.toString(2).count { c -> c == '1' } }).toIntArray()
    }
}