import java.util.*;

public class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freqs = new HashMap<>();
        for (char c : s.toCharArray()) {
            int count = freqs.getOrDefault(c, 0);
            freqs.put(c, count + 1);
        }

        // sort the characters by frequency in reverse order
        List<Character> chars = new ArrayList<>(freqs.keySet());
        chars.sort((c1, c2) -> freqs.get(c2) - freqs.get(c1));

        // build the resulting string
        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            for (int i = 0; i < freqs.get(c); i++) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
