class Solution {
    fun minSubArrayLen(s: Int, nums: IntArray): Int {
        
        var sum = 0
        var start = 0
        var minLength = Integer.MAX_VALUE
        var end = 0
        
        if (nums.size < 1)
            return 0
        
        while(end < nums.size){
            sum += nums[end]
            
            while(sum >= s){
                minLength = Math.min(minLength, end-start+1)
                sum -= nums[start++]
            }
            end++
        }
        return if (start > 0) minLength else 0
    }
}