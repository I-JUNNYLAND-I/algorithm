class Solution {
    public int findGCD(int[] nums) {
        int min = 1000;
        int max = 0;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        int gcd = 0;
        for (int i = 1; i <= max; i++) {
            if (min % i == 0 && max % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}