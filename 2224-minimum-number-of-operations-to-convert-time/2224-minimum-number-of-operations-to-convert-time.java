class Solution {
    public int convertTime(String current, String correct) {
        String[] _correct = correct.split(":");
        int target = Integer.parseInt(_correct[0]) * 60 + Integer.parseInt(_correct[1]);
        String[] _current = current.split(":");
        int currTime = Integer.parseInt(_current[0]) * 60 + Integer.parseInt(_current[1]);
        int count = 0;
        while(target != currTime) {
            if (currTime + 60 <= target) currTime += 60;
            else if (currTime + 15 <= target) currTime += 15;
            else if (currTime + 5 <= target) currTime += 5;
            else if (currTime + 1 <= target) currTime += 1;
            count++;
        }
        return count;
    }
}