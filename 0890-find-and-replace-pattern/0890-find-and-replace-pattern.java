class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new LinkedList<>();

        for(String word : words) {
            int[] tmp = new int[26], s = new int[26];
            boolean isSame = true;

            for(int i=0; i<word.length(); i++) {
                if(s[word.charAt(i) - 'a'] != tmp[pattern.charAt(i) - 'a']) {
                    isSame = false;
                    break;
                } else {
                    s[word.charAt(i) - 'a'] = tmp[pattern.charAt(i) - 'a'] = i+1;
                }
            }

            if(isSame) {
                result.add(word);
            }
        }

        return result;
    }
}