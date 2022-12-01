class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if(temp == '(' || temp == '{' || temp == '[') {
                stack.push(temp);
            } else {
                if(stack.size() == 0) {
                    return false;
                } else if(temp == ')' && stack.peek() != '(') {
                    return false;
                } else if(temp == '}' && stack.peek() != '{') {
                    return false;
                } else if(temp == ']' && stack.peek() != '[') {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.size() == 0;
    }
}