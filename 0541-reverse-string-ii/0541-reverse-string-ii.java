class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();

        int i = 0, j = 0;
        
        while (i < s.length()) {
            
            j = Math.min(i + k, s.length());
            sb.append((new StringBuilder(s.substring(i, j))).reverse());

            if (j >= s.length()) {
                break;
            }

            i = j;
            j = Math.min(i + k, s.length());
            sb.append(s, i, j);

            i = j;
        }

        return sb.toString();
    }
}