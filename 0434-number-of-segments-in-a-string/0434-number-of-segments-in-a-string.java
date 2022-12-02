class Solution {
    public int countSegments(String s) {
        int result = 0;
        String[] s1 = s.split(" ");
        if(s.equals("")) {
            return result;
        } else {
            for (int i = 0; i < s1.length; i++) {
                if(!s1[i].isEmpty()){
                    result++;
                }
            }
        }
        return result;
    }
}