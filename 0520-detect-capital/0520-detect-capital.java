import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

class Solution {

    public boolean detectCapitalUse(String word) {

        if (isUpperCase(word.charAt(0))) {
            if (word.length() > 1) {
                if (isUpperCase(word.charAt(1))) {
                    return word.equals(word.toUpperCase());
                } else if (isLowerCase(word.charAt(1))) {
                    word = word.substring(1);
                    return word.equals(word.toLowerCase());
                }
            } else {
                return true;
            }
        }

        return word.equals(word.toLowerCase());
    }
}