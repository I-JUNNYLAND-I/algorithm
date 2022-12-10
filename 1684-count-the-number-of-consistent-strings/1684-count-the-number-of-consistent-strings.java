import java.util.regex.Pattern;
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        String regex = String.format("^[%s]*$", allowed);
        int count = 0;
        for(String word : words) {
            if (Pattern.matches(regex, word)) {
                count++;
            }
        }
        return count;
    }
}