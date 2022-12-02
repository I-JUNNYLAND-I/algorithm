class Solution {
    public void moveZeroes(int[] nums) {
        int size = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                int tmp = nums[size];
                nums[size++] = nums[i];
                nums[i] = tmp;
            }
        }
    }
}