class Solution {
    public String removeOuterParentheses(String s) {
        int len = s.length();
        int pL = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= len; i++) {
            String sub = s.substring(pL, i);
            if (isValidParentheses(sub)) {
                sb.append(sub.substring(1, sub.length() - 1));
                pL = i;
            }
        }
        return sb.toString();
    }
    
    private boolean isValidParentheses(String s) {
        if (s.isBlank()) return false;
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            if (!stack.isEmpty() && c == ')') {
                if (stack.peek() == '(') stack.pop();
            } else {
                stack.add(c);
            }
        }    
        return stack.size() == 0;
    }
}