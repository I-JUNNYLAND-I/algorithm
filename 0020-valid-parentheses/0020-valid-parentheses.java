class Solution {
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        Map<String, String> open = new HashMap<>();
        open.put("(", ")");
        open.put("{", "}");
        open.put("[", "]");
        Map<String, String> close = new HashMap<>();
        close.put(")", "(");
        close.put("}", "{");
        close.put("]", "[");
        
        String[] arr = s.split("");
        Set<String> openKeys = open.keySet();
        Set<String> closeKeys = close.keySet();
        for(String str : arr) {
            if (openKeys.contains(str)) {
                stack.push(str);
            } else if (closeKeys.contains(str)) {
                if (stack.size() == 0) return false;
                if (stack.peek().equals(close.get(str))) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }
}