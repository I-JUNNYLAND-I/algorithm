class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int result = 0;
        for (String word : words) {
            for (char letter : word.toCharArray()) {
                if (!allowed.contains(letter + "")) {
                    result++;
                    break;
                }
            }
        }

        return words.length - result;
    }
}