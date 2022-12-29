class Solution {
    public int[] diStringMatch(String s) {
        int len = s.length();
        int[] answer = new int[len + 1];
        boolean[] hasUsed = new boolean[len + 1];
        char[] chars = s.toCharArray();
        int pL = 0;
        int pR = len;
        int index = 0;
        for (char c : chars) {
            if (c == 'I') {
                answer[index] = pL;
                hasUsed[pL] = true;
                pL++;
            } else if (c == 'D') {
                answer[index] = pR;
                hasUsed[pR] = true;
                pR--;
            }
            index++;
        }
        if (!hasUsed[pL]) answer[index] = pL;
        if (!hasUsed[pR]) answer[index] = pR;
        return answer;
    }
}