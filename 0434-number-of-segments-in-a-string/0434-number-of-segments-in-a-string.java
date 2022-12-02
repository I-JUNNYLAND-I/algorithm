class Solution {
    public int countSegments(String s) {
        int result = 0;
        String[] arr = s.split(" ");

        for (String value : arr) {
            if (!value.isEmpty()) {
                result++;
            }
        }
        
        return result;
    }
}