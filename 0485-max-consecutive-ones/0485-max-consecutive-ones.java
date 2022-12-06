class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int temp = 0;
        for (int num : nums) {
            if (num == 1) {
                temp++;
            } else if (num == 0) {
                temp = 0;
            }
            max = Math.max(temp, max);
        }
        return max;
    }
}