import java.util.Arrays;

class Solution {

    public int missingNumber(int[] nums) {

        int answer = -1;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                answer = i;
                break;
            }
        }
        if (answer == -1) {
            answer = nums.length;
        }

        return answer;
    }

}