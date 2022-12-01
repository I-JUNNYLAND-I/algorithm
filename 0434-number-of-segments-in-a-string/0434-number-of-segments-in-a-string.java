class Solution {
    public int countSegments(String s) {
        String temp = s.trim();
        if (temp.length() == 0) return 0;
        return temp.split("\\s+").length;
    }
}