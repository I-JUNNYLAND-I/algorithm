class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] answer = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    answer[i] = greaterNumber(Arrays.copyOfRange(nums2, j, nums2.length), nums2[j]);
                }
            }
        }
        return answer;
    }
    
    public int greaterNumber(int[] nums, int k) {
        for(int num : nums) {
            if (k < num) {
                return num;
            }
        }
        return -1;
    }
}