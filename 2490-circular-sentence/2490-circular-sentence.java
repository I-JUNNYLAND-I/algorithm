class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] strs = sentence.split(" ");
        if (strs.length == 1) {
            return strs[0].charAt(0) == strs[0].charAt(strs[0].length() - 1);
        }
        int len = strs.length;
        char head = strs[0].charAt(0);
        char tail = strs[0].charAt(strs[0].length() - 1);
        for(int i = 0; i < len; i++) {
            if (i == len - 1) {
                return head == tail;
            }
            if (strs[i + 1].charAt(0) == tail) {
                tail = strs[i + 1].charAt(strs[i + 1].length() - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}