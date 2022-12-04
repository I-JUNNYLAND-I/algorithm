class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        for(int i = 0; i <= s.length() - 3; i++) {
            String sub = s.substring(i, i + 3);
            if (isGood(sub)) {
                count++;
            }
        }
        return count;
    }
    
    public boolean isGood(String str) {
        Map<Character, Boolean> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (map.containsKey(c)) {
                return false;
            } else {
                map.put(c, true);
            }
        }
        return true;
    }
}