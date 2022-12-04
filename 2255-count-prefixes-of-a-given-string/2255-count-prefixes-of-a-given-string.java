class Solution {
    public int countPrefixes(String[] words, String s) {
        int result = 0;
        for(int i=0; i< words.length; i++) {
            if(s.startsWith(words[i])) {
                result++;
            }
        }
        return result;
    }
}