class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int total = Arrays.stream(cost).sum();
        int index = cost.length - 3;
        while(index >= 0) {
            total -= cost[index];
            index -= 3;
        }
        return total;
    }
}