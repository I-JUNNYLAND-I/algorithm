class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int max = getMax(nums);
        for (int n = 1; n <= max; n++) {
            int count = 0;
            for (int num : nums) {
                if (n <= num) count++;
            }
            if (count == n) return n;
        }
        return -1;
    }
    
    private int getMax(int[] nums) {
        int max = 0;
        for (int num : nums) max = Math.max(max, num);
        return max;
    }
}