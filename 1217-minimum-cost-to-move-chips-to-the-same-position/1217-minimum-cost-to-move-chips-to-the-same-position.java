class Solution {
    public int minCostToMoveChips(int[] position) {
        int[] temp = new int[2];
        for (int pose : position) {
            if (pose % 2 == 0) {
                temp[0]++;
            } else {
                temp[1]++;
            }
        }
        return Math.min(temp[0], temp[1]);
    }
    
}