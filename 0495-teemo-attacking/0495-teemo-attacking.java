class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int sum = duration;
        int currunt = timeSeries[0] + duration-1;

        for (int i = 1; i < timeSeries.length; i++) {
            if(currunt >= timeSeries[i]) {
                sum = sum + timeSeries[i] - timeSeries[i - 1];
            } else {
                sum = sum + duration;
            }
            currunt = timeSeries[i] + duration-1;
        }
        return sum;
    }
}