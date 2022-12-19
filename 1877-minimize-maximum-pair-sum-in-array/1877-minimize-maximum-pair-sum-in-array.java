class Solution {
    public int minPairSum(int[] nums) {
        int result = 0, tmp = 0;
        
        Arrays.sort(nums);
        
        for (int i = 0, j = nums.length - 1; i < nums.length; i++) {
            tmp = nums[i] + nums[j];
            result = Math.max(result, tmp);
            j--;
        }
        
        return result;
    }
}