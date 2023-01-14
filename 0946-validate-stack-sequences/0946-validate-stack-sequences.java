class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int pushPtr = 1;
        int popPtr = 0;
        stack.add(pushed[0]);
        while (popPtr < popped.length) {
            int poppedValue = popped[popPtr];
            if (!stack.isEmpty() && stack.peek() == poppedValue) {
                stack.pop();  
                popPtr++;
            } else {
                int targetIndex = findIndex(pushed, pushPtr, poppedValue);
                if (targetIndex == -1) return false;
                for (int i = pushPtr; i <= targetIndex; i++) {
                    stack.add(pushed[i]);        
                }
                pushPtr = targetIndex + 1;
                stack.pop();
                popPtr++;
            } 
        }
        return true;
    }
    
    private int findIndex(int[] pushed, int startIndex, int value) {
        for (int i = startIndex; i < pushed.length; i++) {
            if (pushed[i] == value) return i;
        }
        return -1;
    }
}