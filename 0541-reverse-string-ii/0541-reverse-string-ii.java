class Solution {
    public String reverseStr(String s, int k) {
        int len = s.length();
        if (len == 1) return s;
        k = Math.min(k, s.length());
        String[] temp = new String[len / k + 1];
        int tempIndex = 0;
        for (int i = 0; i < len; i += k) {
            int firstIndex = i;
            int lastIndex = Math.min(i + k, len);
            temp[tempIndex] = s.substring(firstIndex, lastIndex);
            tempIndex++;
        }
        for (int j = 0; j < temp.length; j++) {
            if (j % 2 == 0 && temp[j] != null) {
                temp[j] = reverse(temp[j]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String t : temp) {
            if (t != null) sb.append(t);
        }
        return sb.toString();
    }
    
    public String reverse(String str) {
        char[] chars = str.toCharArray();
        int len = chars.length;
        for (int i = 0; i < len / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[len - i - 1];
            chars[len - i - 1] = temp;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            sb.append(c);
        }
        return sb.toString();
    }
    
}