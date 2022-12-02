class Solution {
    public boolean closeStrings(String word1, String word2) {
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        Map<Character, Integer> map1 = getCharCountMap(chars1);
        Map<Character, Integer> map2 = getCharCountMap(chars2);
        int[] ints1 = map1.values().stream().mapToInt(Integer::intValue).toArray();
        int[] ints2 = map2.values().stream().mapToInt(Integer::intValue).toArray();
        Set<Character> set1 = map1.keySet();
        Set<Character> set2 = map2.keySet();
        Arrays.sort(ints1);
        Arrays.sort(ints2);
        return Arrays.equals(ints1, ints2) && set1.containsAll(set2);
    }
    
    public Map<Character, Integer> getCharCountMap(char[] chars) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : chars) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }
}