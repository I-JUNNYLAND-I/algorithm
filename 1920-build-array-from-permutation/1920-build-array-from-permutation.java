class Solution {
    public int[] buildArray(int[] nums) {
        int len = nums.length;
        int[] answer = new int[len];
        for (int i = 0; i < len; i++) {
            answer[i] = nums[nums[i]];
        }
        return answer;
    }
}