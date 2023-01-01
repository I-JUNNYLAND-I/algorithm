class Solution {
    public int maxDistance(int[] colors) {
        int len = colors.length;
        int pL = 0;
        int pR = len - 1;
        int first = colors[0];
        int last = colors[len - 1];
        while (pR > 0) {
            if (colors[pR] != first) break;
            else pR--;
        }
        while (pL < colors.length) {
            if (colors[pL] != last) break;
            else pL++;
        }
        return Math.max(len - pL - 1, pR);
    }
}