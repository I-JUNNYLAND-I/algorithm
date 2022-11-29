class Solution {
    public boolean detectCapitalUse(String word) {
        char[] chars = word.toCharArray();
        if(capitalLetterChecker(chars) || smallLetterChecker(chars) || firstLetterChecker(chars)) {
            return true;
        } 
        return false;
    }

    private static boolean capitalLetterChecker(char[] chars) {
        for (char aChar : chars) {
            if(!Character.isUpperCase(aChar)) {
                return false;
            }
        }
        return true;
    }

    private static boolean smallLetterChecker(char[] chars) {
        for (char aChar : chars) {
            if(Character.isUpperCase(aChar)) {
                return false;
            }
        }
        return true;
    }

    private static boolean firstLetterChecker ( char[] chars){
        if(Character.isUpperCase(chars[0])) {
            for (int i = 1; i < chars.length; i++) {
                if(Character.isUpperCase(chars[i])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}