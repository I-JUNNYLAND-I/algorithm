class Solution {
fun maximum69Number (num: Int): Int = num.toString().replaceFirst('6', '9').toInt()
}