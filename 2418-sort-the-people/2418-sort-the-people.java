class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();
        int len = names.length;
        for (int i = 0; i < len; i++) {
            map.put(heights[i], names[i]);
        }
        int[] hArr = Arrays
            .stream(heights)
            .boxed()
            .sorted(Collections.reverseOrder())
            .flatMapToInt(IntStream::of)
            .toArray();
        String[] answer = new String[len];
        for (int j = 0; j < len; j++) {
            answer[j] = map.get(hArr[j]);
        }
        return answer;
    }
}