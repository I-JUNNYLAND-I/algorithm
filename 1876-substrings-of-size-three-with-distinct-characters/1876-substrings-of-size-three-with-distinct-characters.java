class Solution {
    public int countGoodSubstrings(String s) {
        int result = 0;

        //n-2개 -> asd, sdb, dbb, bbc,bca,cab,abc
        for(int i=0; i<s.length()-2; i++) {
            String tmpStr = s.substring(i, i+3);
            if((tmpStr.charAt(0) != tmpStr.charAt(1)) && (tmpStr.charAt(1) != tmpStr.charAt(2)) && (tmpStr.charAt(0) != tmpStr.charAt(2))){
                result++;
            }
        }

        return result;
    }
}