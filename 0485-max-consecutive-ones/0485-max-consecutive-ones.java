class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int temp = 0;
        int result = 0;
        for (int num : nums) {
            if(num == 1) temp++;
            else if(num == 0) {
                if (temp > result)
                    result = temp;
                temp = 0;
            }
        }
        if(temp > result) result = temp;
        return result;
    }
}