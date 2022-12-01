import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }

        List<Integer> collect = new ArrayList<>(map.keySet());
        collect.sort(Collections.reverseOrder());

        System.out.println(collect.toString());

        String[] result = new String[names.length];

        for (int i = 0; i < collect.size(); i++) {
            result[i] = map.get(collect.get(i));
        }

        return result;
    }
}