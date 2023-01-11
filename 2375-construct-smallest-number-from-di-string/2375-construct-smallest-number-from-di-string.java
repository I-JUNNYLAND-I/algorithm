class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        char numChar = '1';
        char[] chars = pattern.toCharArray();
        for (char c : chars) {
            sb2.append(numChar++);
            if (c == 'I') {
                sb1.append(sb2.reverse());
                sb2.setLength(0);
            }
        }
        sb2.append(numChar++);
        sb1.append(sb2.reverse());
        return sb1.toString();
    }
}
