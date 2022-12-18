class Solution {
    public int numOfPairs(String[] nums, String target) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                String concat = nums[i] + nums[j];
                String reversedConcat = nums[j] + nums[i];
                if (concat.equals(target)) count++;
                if (reversedConcat.equals(target)) count++;
            }
        }
        return count;
    }
}