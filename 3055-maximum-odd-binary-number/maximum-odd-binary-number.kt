class Solution {
    fun maximumOddBinaryNumber(s: String) = s.count{it=='1'}.let{ "1".repeat(it-1) + "0".repeat(s.length-it) + "1" }
}