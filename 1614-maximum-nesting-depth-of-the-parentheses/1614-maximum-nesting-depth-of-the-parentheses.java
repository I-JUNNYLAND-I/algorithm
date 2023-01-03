class Solution {
    public int maxDepth(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        int max = 0;
        for (char c : chars) {
            if (c == '(') {
                stack.add(c);
            } else if (c == ')') {
                stack.pop();
            }
            max = Math.max(max, stack.size());
        }
        return max;
    }
}