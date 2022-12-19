class Solution {
    public String truncateSentence(String s, int k) {
        String[] strArr = s.split(" ");
        StringBuilder result = new StringBuilder();

        for(int i=0; i<k; i++) {
            result.append(strArr[i]).append(" ");
        }

        return result.toString().trim();
    }
}