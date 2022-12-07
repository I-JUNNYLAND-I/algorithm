class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPair =  0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int temp = nums[i];
            for (int j = i + 1; j < len; j++) {
                if (temp == nums[j]) {
                    goodPair++;
                }
            }
        }
        return goodPair;
    }
}