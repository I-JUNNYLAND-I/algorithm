import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        Map<String, String[]> map = new HashMap<>();
        map.put("2", new String[]{"a", "b", "c"});
        map.put("3", new String[]{"d", "e", "f"});
        map.put("4", new String[]{"g", "h", "i"});
        map.put("5", new String[]{"j", "k", "l"});
        map.put("6", new String[]{"m", "n", "o"});
        map.put("7", new String[]{"p", "q", "r", "s"});
        map.put("8", new String[]{"t", "u", "v"});
        map.put("9", new String[]{"w", "x", "y", "z"});
        
        if (digits.length() == 0) return Collections.emptyList();
        String[] digitArr = digits.split("");
        List<String> list = new ArrayList<>();
        for (String digit : digitArr) {
            String[] letters = map.get(digit);
            if (list.isEmpty()) {
                list.addAll(Arrays.asList(letters));
            } else {
                List<String> temp = new ArrayList<>();
                for (String letter : letters) {
                    for (String s : list) {
                        temp.add(s + letter);
                    }
                }
                list = temp;
            }
        }
        return list;
    }
}