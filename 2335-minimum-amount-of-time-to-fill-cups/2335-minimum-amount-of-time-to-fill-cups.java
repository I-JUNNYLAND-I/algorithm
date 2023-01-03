class Solution {
    public int fillCups(int[] amount) {
        int count = 0;
        while(sum(amount) > 0) {
            int[] indices = findIndex(amount);
            int p = indices[0];
            int q = indices[1];
            int r = indices[2];
            amount[p]--;
            if (amount[q] > 0) amount[q]--;
            else if (amount[r] > 0) amount[r]--;
            count++;
        }
        return count;
    }
    
    private int[] findIndex(int[] nums) {
        if (nums[0] >= nums[1] && nums[0] >= nums[2]) return new int[]{0, 1, 2};
        if (nums[1] >= nums[0] && nums[1] >= nums[2]) return new int[]{1, 2, 0};
        return new int[]{2, 1, 0};
    }
    
    private int sum(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;
        return sum;
    }
    
}