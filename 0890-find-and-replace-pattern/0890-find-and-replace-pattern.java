class Solution {
    
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        for (String str : words) {
            if (isMatchWithPattern(str, pattern)) {
                list.add(str);
            }
        }
        return list;
    }
    
    public boolean isMatchWithPattern(String word, String pattern) {
        int len = word.length();
        String temp = word;
        for (int i = 0; i < len; i++) {
            char cW = word.charAt(i);
            char cP = pattern.charAt(i);
            if (word.indexOf(cW) != pattern.indexOf(cP)) {
                return false;
            }
        }
        return true;
    }
    
}