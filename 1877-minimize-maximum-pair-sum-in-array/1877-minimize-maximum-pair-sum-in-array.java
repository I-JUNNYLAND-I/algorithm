import java.util.Arrays;

class Solution {

    public int minPairSum(int[] nums) {

        int answer = 0;
        Arrays.sort(nums);

        int[] subAnswer = new int[nums.length / 2];

        for (int i = 0; i < nums.length / 2; i++) {
            subAnswer[i] = nums[i] + nums[nums.length - 1 - i];
        }

        Arrays.sort(subAnswer);

        return subAnswer[subAnswer.length - 1];
    }
}