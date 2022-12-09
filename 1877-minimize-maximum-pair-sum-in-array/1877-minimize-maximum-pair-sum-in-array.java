class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int max = 0;
        for(int i = 0; i < len; i++) {
            max = Math.max(nums[i] + nums[len - i - 1], max);
        }
        return max;
    }
}