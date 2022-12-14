class Solution {
fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var temp =0;
    var max = 0;

    nums.forEach {
        if(it == 1){
            temp++
        } else{
            if(temp > max){
                max = temp
            }
            temp = 0
        }
    }
    if(temp > max){
        max = temp
    }
    return max
}
}