class ProductOfNumbers {
    
    int[] nums = new int[40_001];
    int index = 0;

    public ProductOfNumbers() {
    }
    
    public void add(int num) {
        nums[index] = num;
        index++;
    }
    
    public int getProduct(int k) {
        int p = 1;
        for (int i = index - k; i < index; i++) p *= nums[i];
        return p;
    }
    
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */