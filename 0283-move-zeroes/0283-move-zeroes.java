class Solution {
    public void moveZeroes(int[] nums) {
        int zeroSize = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroSize++;
            } else {
                int temp = nums[i];
                nums[i] = 0;
                nums[i - zeroSize] = temp;
            }
        }
    }
}