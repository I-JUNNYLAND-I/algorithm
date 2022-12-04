class Solution {
    public int minimumAverageDifference(int[] nums) {
        int len = nums.length;
        long min = Long.MAX_VALUE;
        int answer = 0;
        long firstSum = 0;
        long lastSum = sum(nums);
        for(int i = 0; i < len; i++) {
            firstSum += nums[i];
            lastSum -= nums[i];
            long firstAvr = firstSum / (i + 1);
            long lastAvr = 0;
            if (len - i - 1 != 0) {
               lastAvr = lastSum / (len - i - 1);
            }
            long avrDiff = Math.abs(firstAvr - lastAvr);
            if (avrDiff < min) {
                answer = i;
                min = avrDiff;
            }
        }
        return answer;
    }
    
    private long sum(int[] nums) {
        long sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return sum;
    }
}