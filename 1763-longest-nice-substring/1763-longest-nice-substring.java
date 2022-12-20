class Solution {
    public String longestNiceSubstring(String s) {
        String result = "";
           
        for (int i = 0; i < s.length(); i++) {
            boolean[] lower = new boolean[26];
            boolean[] upper = new boolean[26];
            
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(j) < 'a') upper[s.charAt(j) - 'A'] = true;
                else                   lower[s.charAt(j) - 'a'] = true;
                
                if (Arrays.equals(lower, upper) && result.length() <= j - i) {
                    result = s.substring(i, j + 1);
                }                
            }
        }
        return result;
    }
}