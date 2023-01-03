class Solution {
    fun largestOddNumber(num: String): String =
        num.dropLastWhile { Character.getNumericValue(it) % 2 == 0 }
}