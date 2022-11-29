class Solution {

    public int numJewelsInStones(String jewels, String stones) {
        String[] split = stones.split("");

        int answer = 0;
        for (int i = 0; i < split.length; i++) {
            if (jewels.contains(split[i])) {
                answer++;
            }
        }

        return answer;
    }
}