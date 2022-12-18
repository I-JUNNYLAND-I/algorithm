import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> answer = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        if (strs == null) {
            return answer;
        }
        for (String str : strs) {
            char[] next = str.toCharArray();
            Arrays.sort(next);
            String temp = Arrays.toString(next);
            if (map.containsKey(temp)) map.get(temp).add(str);
            else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(temp, list);
            }
        }
        return new ArrayList<>(map.values());
    }
}