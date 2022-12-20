class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        HashMap<Integer, Integer> r = new HashMap<Integer, Integer>();
        HashMap<Character, Integer> s = new HashMap<Character, Integer>();
        for (char cur : suits) {
            s.put(cur, s.getOrDefault(cur, 0) + 1);
        }
        if (s.size() == 1) return "Flush";
        String res = "High Card";
        for (int cur : ranks) {
            if (r.containsKey(cur)) {
                r.put(cur, r.get(cur) + 1);
                if (r.get(cur) == 2) {
                    res = "Pair";
                } else if (r.get(cur) == 3) {
                    res = "Three of a Kind";
                    break;
                }
            } else {
                r.put(cur, 1);
            }
        }
        return res;
    }
}