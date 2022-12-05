class Solution {
    public String sortSentence(String s) {
        String[] s1 = s.split(" ");
        String[] s2 = new String[s1.length];

        for (String x : s1) {
            s2[Character.getNumericValue(x.charAt(x.length() - 1)) - 1] = x.substring(0, x.length() - 1);
        }

        String result = "";
        for(int i = 0; i < s2.length-1; i++) {
            result += s2[i];
            result += " ";
        }
        result += s2[s2.length-1];
        return result;
    }
}