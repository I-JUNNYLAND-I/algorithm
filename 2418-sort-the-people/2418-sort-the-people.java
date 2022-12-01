import java.util.*;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] result = new String[names.length];

        HashMap<Integer, String> nameAndHeight = new HashMap<>();
        for(int i=0; i< names.length; i++) {
            nameAndHeight.put(heights[i], names[i]);
        }

        List<Integer> tmpHeight = new ArrayList<>(nameAndHeight.keySet());

        tmpHeight.sort(Collections.reverseOrder());

        int resultArrLength = 0;

        for(int j : tmpHeight) {
            result[resultArrLength] = nameAndHeight.get(j);
            resultArrLength++;
        }

        return result;
    }
}