class CustomStack {

    int[] list;
    int idx;
    public CustomStack(int maxSize) {
        list = new int[maxSize];
        idx=-1;
    }
    
    public void push(int x) {
        if(idx < list.length-1) list[++idx]=x;
    }
    
    public int pop() {
        if(idx == -1) return -1;
        return list[idx--];
    }
    
    public void increment(int k, int val) {
        int count = k > list.length? list.length : k;
        while(count-- > 0) list[count] += val;
    }
}