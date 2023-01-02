class Solution {
    public int minPartitions(String n) {
        char[] chars = n.toCharArray();
        int max = 0;
        for (char c : chars) {
            max = Math.max(max, c - 48);
        }
        return max;
    }
}