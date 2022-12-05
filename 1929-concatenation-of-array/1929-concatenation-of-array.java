class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] nums2 = nums.clone();
        int[] result;
        return result = IntStream.concat(Arrays.stream(nums), Arrays.stream(nums2)).toArray();
    }
}