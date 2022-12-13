class Solution {
    public String sortSentence(String s) {
        String[] strArr = s.split(" ");
        String[] sortedStr = new String[strArr.length];

        for(String word : strArr) {
            char [] ch = word.toCharArray();
            int i = Integer.parseInt(word.substring(ch.length - 1));
            sortedStr[i - 1] = word.substring(0, ch.length - 1);
        }
        
        return String.join(" ", sortedStr);
    }
}