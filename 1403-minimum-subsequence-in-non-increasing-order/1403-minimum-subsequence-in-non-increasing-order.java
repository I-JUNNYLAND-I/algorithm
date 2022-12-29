class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int total = Arrays.stream(nums).sum();
        int curr = 0;
        int index = nums.length - 1;
        List<Integer> answer = new ArrayList<>();
        while (index >= 0) {
            if (curr <= total) {
                answer.add(nums[index]);
                curr += nums[index];
                total -= nums[index];
            }
            index--;
        }
        return answer;
    }
}