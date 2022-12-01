class Solution {
    public boolean halvesAreAlike(String s) {
        int len = s.length();
        String a = s.substring(0, len/2);
        String b = s.substring(len/2, len);
        return getNumberOfVowels(a) == getNumberOfVowels(b);
    }
    
    private int getNumberOfVowels(String str) {
        char[] charArray = str.toCharArray();
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int count = 0;
        for(char c : charArray) {
            if(vowels.contains(c)) {
                count++;
            }
        }
        return count;
    }
}