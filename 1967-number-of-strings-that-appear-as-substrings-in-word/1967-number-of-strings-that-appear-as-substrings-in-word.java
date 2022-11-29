class Solution {
    public int numOfStrings(String[] patterns, String word) {

        int answer = 0;
        
        for (String pattern : patterns) {
            if (word.contains(pattern)) {
                answer++;
            }
        }
        
        return answer;
    }
}