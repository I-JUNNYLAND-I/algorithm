class Solution {
    public int findContentChildren(int[] g, int[] s) {
        boolean[] hasEaten = new boolean[g.length];
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < g.length; j++) {
                if(!hasEaten[j] && g[j] <= s[i]) {
                    hasEaten[j] = true;
                    s[i] = 0;
                    count++;
                }
            }
        }
        return count;
    }
}