class Solution {
fun moveZeroes(nums: IntArray): Unit {
    var index = 0
    for(i in nums.indices) {
        if(nums[i] != 0) {
            nums[index++] = nums[i]
        }
    }

    while (index < nums.size) {
        nums[index++] = 0
    }

}
}