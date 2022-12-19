class Solution {
    public int missingNumber(int[] nums) {
        int result = nums.length;          
        int i = 0;
        for(i = 0; i <nums.length ;i++){
            result ^= i ^ nums[i];
        }
        return result;
    }
}