class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result = "";
        int w1 = 0;
        int w2 = 0;

        while(true) {
            if(word1.length() > w1) {
                result += word1.charAt(w1);
                w1++;
            }
            if(word2.length() > w2) {
                result += word2.charAt(w2);
                w2++;
            }
            if(word1.length() == w1 && word2.length() == w2)
                break;
        }
        return result;
    }
}