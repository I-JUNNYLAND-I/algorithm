class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        int[] origin = Arrays.copyOf(nums, nums.length);
        int[] temp = new int[nums.length];
        temp[0] = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                nums[i + 1] = nums[i] + 1;
            }
            temp[i + 1] = nums[i + 1];
        }
        for (int i = 0; i < origin.length; i++) {
            count += (temp[i] - origin[i]);
        }
        return count;
    }
}