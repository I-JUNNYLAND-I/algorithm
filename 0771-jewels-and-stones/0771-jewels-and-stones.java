class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        int result = 0;
        for (char j : jewels.toCharArray())
            set.add(j);
        for (char s : stones.toCharArray()) {
            if (set.contains(s))
                result++;
        }

        return result;
    }
}
