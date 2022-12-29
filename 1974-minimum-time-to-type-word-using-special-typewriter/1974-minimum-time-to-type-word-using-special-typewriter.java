class Solution {
    public int minTimeToType(String word) {
        char[] chars = word.toCharArray();
        char current = 'a';
        int cost = 0;
        for (char c : chars) {
            if (c == current) {
                cost++;
            } else {
                int diff = Math.abs(c - current);
                if (diff > 12) cost += (26 - diff);
                else cost += diff;
                cost++;
                current = c;
            }
        }
        return cost;
    }
}