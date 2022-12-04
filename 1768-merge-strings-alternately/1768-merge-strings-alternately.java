class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        String temp = "";
        int len1 = word1.length();
        int len2 = word2.length();
        int maxLen = Math.max(len1, len2);
        int index = 0;
        while (index < maxLen) {
            if (index < len1) {
                sb.append(word1.charAt(index));    
            }
            if (index < len2) {
                sb.append(word2.charAt(index));
            }
            index++;
        }
        return sb.toString();
    }
}