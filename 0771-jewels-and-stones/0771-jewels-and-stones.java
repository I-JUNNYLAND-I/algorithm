class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        String[] jewels1 = jewels.split("");
        String[] stones1 = stones.split("");

        for (int i = 0; i < jewels1.length; i++) {
            for (int j = 0; j < stones1.length; j++) {
                if(jewels1[i].equals(stones1[j])) {
                    result++;
                }
            }
        }
        return result;
    }
}