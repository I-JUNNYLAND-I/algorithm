class Solution {
fun singleNonDuplicate(nums: IntArray): Int {
    for (i in 0..nums.lastIndex step 2){
        if (i == nums.lastIndex) return nums[i]
        if (nums[i] != nums[i+1]) return nums[i]
    }
    return nums.last()
}
}