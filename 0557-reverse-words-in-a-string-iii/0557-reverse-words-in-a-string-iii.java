class Solution {
    public String reverseWords(String s) {
        String[] tokens = s.split(" ");
        String[] temp = new String[tokens.length];
        int count = 0;
        for(String token : tokens) {
            temp[count++] =reverse(token);
        }
        return String.join(" ", temp);
    }
    
    private String reverse(String token) {
        String[] sArr = token.split("");
        StringBuilder sb = new StringBuilder();
        int len = sArr.length;
        for(int i = 0; i < len; i++) {
            sb.append(sArr[len - i - 1]);
        }
        return sb.toString();
    }
    
}