class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {

        int poisoned = 0;
        int nextWakeup = 0;

        for(int time : timeSeries) {
            if (time < nextWakeup) poisoned -= nextWakeup - time;
            poisoned += duration;
            nextWakeup = time + duration;
        }

        return poisoned;
    }
}