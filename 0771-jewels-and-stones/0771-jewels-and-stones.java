class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        List<String> jewelList = List.of(jewels.split(""));
        String[] _stones = stones.split("");
        int answer = 0;
        for (String stone : _stones) {
            if (jewelList.contains(stone)) answer++;
        }
        return answer;
    }
}