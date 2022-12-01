class Solution {

    public int countSegments(String s) {

        if (s.length() == 0) {
            return 0;
        }

        String[] split = s.split(" ");

        int answer = 0;
        
        for (String s1 : split) {
            if (!s1.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}