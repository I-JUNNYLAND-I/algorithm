import java.util.Arrays;

class Solution {
    public char findTheDifference(String s, String t) {

        String[] splitS = s.split("");
        String[] splitT = t.split("");
        Arrays.sort(splitS);
        Arrays.sort(splitT);

        for (int i = 0; i < t.length()-1; i++) {
            if (!splitT[i].equals(splitS[i])) {
                return splitT[i].charAt(0);
            }
        }

        return splitT[splitT.length-1].charAt(0);
    }
}