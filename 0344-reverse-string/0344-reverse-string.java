class Solution {
    public void reverseString(char[] s) {
        int size = s.length;
        for (int i = 0; i < size / 2; i++) {
            char temp = s[i];
            char temp2 = s[s.length - i - 1];
            s[i] = temp2;
            s[s.length - i - 1] = temp;
        }
    }
}