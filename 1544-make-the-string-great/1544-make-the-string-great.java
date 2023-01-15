class Solution {
    public String makeGood(String s) {
        char[] letters = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        stack.add(letters[0]);
        int i = 1;
        while (i < letters.length) {
            if (!stack.isEmpty() && Math.abs(stack.peek() - letters[i]) == 'a' - 'A') {
                stack.pop();
            } else {
                stack.add(letters[i]);
            }
            i++;
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }
}