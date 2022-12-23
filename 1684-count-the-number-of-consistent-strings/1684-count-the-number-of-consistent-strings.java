import java.util.regex.Pattern;
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        String regex = String.format("^[%s]*$", allowed);
        Pattern pattern = Pattern.compile(regex);
        int count = 0;
        for(String word : words) {
            if (pattern.matcher(word).matches()) count++;
        }
        return count;
    }
}
