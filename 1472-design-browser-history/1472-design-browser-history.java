class BrowserHistory {
    
    
    Stack<String> backStack = new Stack<>();
    Stack<String> frontStack = new Stack<>();
    
    public BrowserHistory(String homepage) {
        backStack.add(homepage);
    }
    
    public void visit(String url) {
        backStack.add(url);
        frontStack.clear();
    }
    
    public String back(int steps) {
        int step = 0;
        while(backStack.size() > 1 && step < steps) {
            String history = backStack.pop();
            frontStack.add(history);
            step++;
        }
        return backStack.size() == 0 ? "null" : backStack.peek();
    }
    
    public String forward(int steps) {
        int step = 0;
        while(frontStack.size() > 0 && step < steps) {
            String history = frontStack.pop();
            backStack.add(history);
            step++;
        }
        return backStack.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */