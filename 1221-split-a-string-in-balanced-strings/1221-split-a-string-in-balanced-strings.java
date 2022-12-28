class Solution {
    public int balancedStringSplit(String s) {
        int rCount = 0;
        int lCount = 0;
        int answer = 0;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == 'R') rCount++;
            else if (c == 'L') lCount++;
            if (rCount == lCount) {
                answer++;
                rCount = 0;
                lCount = 0;
            }
        }
        return answer;
    }
}