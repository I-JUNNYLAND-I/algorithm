class Solution {
    public String mergeAlternately(String word1, String word2) {
        String[] word1Arr = word1.split("");
        String[] word2Arr = word2.split("");
        StringBuilder result = new StringBuilder();

        if(word1Arr.length == word2Arr.length) {
            for(int i=0; i<word1Arr.length; i++) {
                result.append(word1Arr[i]);
                result.append(word2Arr[i]);
            }
        } else if (word1Arr.length > word2Arr.length) {
            for (int i=0; i< word2Arr.length; i++) {
                result.append(word1Arr[i]);
                result.append(word2Arr[i]);
            }

            for(int j=word2Arr.length; j< word1Arr.length; j++) {
                result.append(word1Arr[j]);
            }

        } else if (word2Arr.length > word1Arr.length) {
            for (int i=0; i< word1Arr.length; i++) {
                result.append(word1Arr[i]);
                result.append(word2Arr[i]);
            }

            for(int j= word1Arr.length; j< word2Arr.length; j++) {
                result.append(word2Arr[j]);
            }
        }
        
        return result.toString();
    }
}