class CustomStack {

    private int index = 0;
    private Integer[] stack;
    
    public CustomStack(int maxSize) {
        stack = new Integer[maxSize];
    }
    
    public void push(int x) {
        if (index < stack.length) {
            stack[index] = x;
            index++; 
        } 
    }
    
    public int pop() {
        index--;
        if (index < 0) {
            index = 0;
            return -1;
        }
        int value = stack[index];
        return value;
    }
    
    public void increment(int k, int val) {
        int target = index < k ? index : k;
        for (int i = 0; i < target; i++) {
            stack[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */