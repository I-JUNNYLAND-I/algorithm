class Solution {
    public char findTheDifference(String s, String t) {
        char result;
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);

        for (int i = 0; i < tt.length-1; i++) {
            if(ss[i] != tt[i]) {
                return tt[i];
            }
        }
        return tt[tt.length-1];
    }
}