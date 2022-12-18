class MyQueue {

    private Stack<Integer> front = new Stack();
    private Stack<Integer> rear = new Stack();
    
    public MyQueue() {
        
    }
    
    public void push(int x) {
        while (!rear.isEmpty()) {
            front.push(rear.pop());
        }
        front.push(x);
    }
    
    public int pop() {
        while (!front.empty()) {
            rear.push(front.pop());
        }
        return rear.pop();
    }
    
    public int peek() {
        while (!front.empty()) {
            rear.push(front.pop());
        }
        return rear.peek();
    }
    
    public boolean empty() {
        return front.empty() && rear.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */