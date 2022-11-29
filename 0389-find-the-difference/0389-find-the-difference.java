class Solution {
    public char findTheDifference(String s, String t) {
        String[] _s = s.split("");
        for(String c : _s) {
            t = t.replaceFirst(c, "");
        }
        return t.charAt(0);
    }
}