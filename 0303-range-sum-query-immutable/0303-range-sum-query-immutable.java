class NumArray {
    
    private final int[] nums;
    
    public NumArray(int[] nums) {
        this.nums = nums;
    }
    
    public int sumRange(int left, int right) {
        int[] temp = Arrays.copyOfRange(nums, left, right + 1);
        int sum = 0;
        for(int num : temp) {
            sum += num;
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */