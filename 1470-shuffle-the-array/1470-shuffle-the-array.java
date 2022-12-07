class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] answer = new int[nums.length];
        for(int i = 0; i < nums.length / 2; i++) {
            answer[2 * i] = nums[i];
            answer[2 * i +1 ] = nums[i + nums.length / 2];
        }
        return answer;
    }
}