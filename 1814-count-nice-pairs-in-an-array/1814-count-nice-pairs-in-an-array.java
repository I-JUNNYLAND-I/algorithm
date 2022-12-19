class Solution {
    public int countNicePairs(int[] nums) {

        int answer = 0;
        int mod = (int) (1e9 + 7);
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i] - reserve(nums[i]);
            Integer ans = map.getOrDefault(num, 0);
            map.put(num, ans + 1);
            answer = (answer + ans) % mod;
        }

        return answer;
}

    private int reserve(int num) {
        int ans = 0;
        while (num != 0) {
            ans = ans * 10 + num % 10;
            num /= 10;
        }
        return ans;
    }
}