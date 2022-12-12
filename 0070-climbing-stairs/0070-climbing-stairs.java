class Solution {
    public int climbStairs(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(2,2);
        return step(n, map);
    }
    
    public int step(int n, Map<Integer, Integer> map) {
        if (map.containsKey(n)) {
            return map.get(n);
        } else {
            int s = step(n - 1, map) + step(n - 2, map);
            map.put(n, s);
            return s;
        }
    }
}