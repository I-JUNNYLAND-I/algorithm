import java.util.Arrays;

import java.util.Arrays;

class Solution {
    public char findTheDifference(String s, String t) {
        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);
        char[] tArr = t.toCharArray();
        Arrays.sort(tArr);
        
        return tArr[Arrays.mismatch(sArr, tArr)];
    }
}