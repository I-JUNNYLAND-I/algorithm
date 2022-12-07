class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int poisend = 0;
        int recoverAt = 0;
        for(int i = 0; i < timeSeries.length; i++) {
            if (timeSeries[i] < recoverAt) {
                poisend += (timeSeries[i] - timeSeries[i - 1]);
            } else { 
                poisend += duration;
            }
            recoverAt = timeSeries[i] + duration;
        }
        return poisend;
    }
}