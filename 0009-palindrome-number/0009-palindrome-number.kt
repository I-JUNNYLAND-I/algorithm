class Solution {
    fun isPalindrome(x: Int): Boolean {
        val str = x.toString()
        var left = 0
        var right = str.length-1
        while(left < right){
            if(str[left] == str[right]){
                left +=1
                right -=1
            }else{
                return false
            }
        }
        return true
    }
}