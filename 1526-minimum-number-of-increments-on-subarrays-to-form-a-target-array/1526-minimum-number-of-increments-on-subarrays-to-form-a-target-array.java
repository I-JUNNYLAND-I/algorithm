class Solution {
    public int minNumberOperations(int[] target) {
        int count = 0;
        for (int i = 0; i < target.length - 1; i++) {
            if (target[i] > target[i + 1]) {
                count += (target[i] - target[i + 1]);
            }
        }
        count += target[target.length - 1];
        return count;
    }
}