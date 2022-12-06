import java.util.HashMap;
import java.util.Map;

class Solution {

    public String sortSentence(String s) {

        String[] s1 = s.split(" ");
        Map<Integer, String> map = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (String s2 : s1) {
            System.out.println("s2.substring(s2.length() - 2, s2.length() - 1) = " + s2.substring(s2.length() - 1));
            int key = Integer.parseInt(s2.substring(s2.length() - 1));
            String value = s2.substring(0, s2.length() - 1);
            map.put(key, value);
        }
        map.forEach((key, value) -> stringBuilder.append(value).append(" "));

        return stringBuilder.toString().trim();
    }

}