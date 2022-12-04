class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        char[] chars = address.toCharArray();
        for(char c : chars) {
            if ( c != '.') {
                sb.append(c);
            } else { 
                sb.append("[.]");
            }
        }
        return sb.toString();
    }
}