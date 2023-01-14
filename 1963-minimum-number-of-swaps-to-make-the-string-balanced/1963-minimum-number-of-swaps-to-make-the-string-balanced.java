class Solution {
    public int minSwaps(String s) {
        Stack<Character> stack = new Stack();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (!stack.isEmpty() && c == ']') {
                if (stack.peek() == '[') stack.pop();
            } else {
                stack.add(c);
            }
        }
        return (int)Math.ceil(stack.size() / 2);
    }
}