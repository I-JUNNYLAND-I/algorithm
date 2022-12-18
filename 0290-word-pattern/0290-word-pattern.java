class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] p = pattern.split("");
        String[] strs = s.split(" ");
        if(p.length != strs.length) {
            return false;
        }
        Map<String, String> map = new HashMap<>();
        Map<String, String> _map = new HashMap<>();
        for(int i = 0; i < p.length; i++) {
            if (map.containsKey(p[i])) {
                if (!strs[i].equals(map.get(p[i]))) return false;
            } else {
                map.put(p[i], strs[i]);
            }
            if (_map.containsKey(strs[i])) {
                if (!p[i].equals(_map.get(strs[i]))) return false;
            } else {
                _map.put(strs[i], p[i]);
            }
        }
        return true;
    }
}