class Solution {
    public boolean detectCapitalUse(String ex) {
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        char[] exArr = ex.toCharArray();
        
        for(int i=0; i< exArr.length; i++) {
            if(Character.isUpperCase(exArr[i])) {
                upperCaseCount++;
            } else if (Character.isLowerCase(exArr[i])) {
                lowerCaseCount++;
            }
        }
        
        if(ex.length() == upperCaseCount || ex.length() == lowerCaseCount) {
            return true;
        } else if(upperCaseCount == 1 && Character.isUpperCase(exArr[0])) {
            return true;
        } else {
            return false;
        }
    }
}