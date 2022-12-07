class Solution {
    public int missingNumber(int[] nums) {
        int[] table = new int[10_000];
        for (int num : nums) {
            table[num]++;
        }
        for (int i = 0; i < table.length; i++) {
            if (table[i] == 0) {
                return i;
            }
        }
        return nums.length - 1;
    }
}