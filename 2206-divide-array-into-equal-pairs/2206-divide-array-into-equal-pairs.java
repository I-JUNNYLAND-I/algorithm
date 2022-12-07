class Solution {
    public boolean divideArray(int[] nums) {
        int[] arr = new int[1000];
        for(int num : nums) {
            arr[num]++;
        }
        int[] temp = Arrays.stream(arr).filter(n -> n != 0).toArray();
        for(int num : temp) {
            if (num % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}