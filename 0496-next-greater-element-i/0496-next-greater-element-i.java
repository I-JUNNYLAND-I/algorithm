class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] answer = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    answer[i] = greaterNumber(nums2, j, nums2[j]);
                }
            }
        }
        return answer;
    }
    
    public int greaterNumber(int[] nums, int index, int k) {
        for(int i = index; i < nums.length; i++) {
            if (k < nums[i]) {
                return nums[i];
            }
        }
        return -1;
    }
}