class Solution {
    public int[] shuffle(int[] nums, int n) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            result.add(nums[i]);
            result.add(nums[n+i]);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}