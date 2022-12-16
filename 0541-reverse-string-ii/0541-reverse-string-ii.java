
class Solution {
    public String reverseStr(String s, int k) {

        char[] sArray = s.toCharArray();
        for(int start=0;start<sArray.length;start+=2*k){
            int i = start;
            int j = Math.min(start+k-1, sArray.length-1);
            while(i<j){
                char ch = sArray[i];
                sArray[i++] = sArray[j];
                sArray[j--] = ch;
            }
        }
        return new String(sArray);
        
    }
}