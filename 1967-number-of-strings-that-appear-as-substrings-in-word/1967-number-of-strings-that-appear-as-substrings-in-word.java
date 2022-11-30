class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int answer = 0;
        for(String s : patterns) {
            if(word.indexOf(s) != -1) {
                answer++;
            }
        }
        return answer;
    }
}