class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        int[] suitArray = new int[4];
        for (char c : suits) {
            suitArray[c - 97]++;
            if (suitArray[c - 97] == 5) {
                return "Flush";
            }
        }
        int[] rankArray = new int[13];
        for (int rank : ranks) {
            rankArray[rank - 1]++;
        }
        int max = 0;
        for (int count : rankArray) {
            max = Math.max(max, count);
        }
        if (max >= 3) {
            return "Three of a Kind";
        } else if (max == 2) {
            return "Pair";
        }
        return "High Card";
    }
}