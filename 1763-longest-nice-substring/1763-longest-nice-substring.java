class Solution {
    public String longestNiceSubstring(String s) {
        int length = s.length();
        String maxStr = "";
        for(int left = 0; left < length; left++){
            for(int right = left + 1; right < length; right++){
              String sub = s.substring(left, right + 1);
              if (isNice(sub) && (sub.length() > maxStr.length()))
                  maxStr = sub;
            }
        }
        return maxStr;
    }
    
    public boolean isNice(String s) {
        char[] chars = s.toCharArray();
        int[] ascii = new int[52];
        for (char c : chars) {
            if (65 <= c && c <= 90) {
                ascii[c - 65]++;
            } else {
                ascii[c - 71]++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (ascii[i] != 0 && ascii[i + 26] == 0) return false;
            if (ascii[i + 26] != 0 && ascii[i] == 0) return false;
        }
        return true;
    }
}