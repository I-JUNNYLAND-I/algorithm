import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char comp = s.charAt(i);

            if(comp == '(' || comp == '{' || comp == '['){
                stack.push(comp);
            }
            else{
                if(stack.size() == 0)
                    return false;
                if(comp == ')' && stack.peek() != '(')
                    return false;
                else if(comp == '}' && stack.peek() != '{')
                    return false;
                else if(comp == ']' && stack.peek() != '[')
                    return false;
                else
                    stack.pop();
            }
        }
        return stack.size() == 0;
    }
}