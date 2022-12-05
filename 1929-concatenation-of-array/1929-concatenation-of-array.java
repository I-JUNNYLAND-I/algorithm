class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] newNums = new int[len * 2];
        for (int i = 0; i < len; i++) {
            newNums[i] = nums[i];
            newNums[i + len] = nums[i];
        }
        return newNums;
    }
}