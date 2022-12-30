class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int total = Arrays.stream(arr).sum();
        int target = total / 3;
        if (total != target * 3) return false;
        
        int len = arr.length;
        int part1 = 0;
        int sum1 = 0;        
        for (int i = 0; i < len; i++) {
            sum1 += arr[i];
            part1 = i + 1;
            if (sum1 == target) break;
        }
        if (part1 == len) return false;
        int part2 = 0;
        int sum2 = 0;
        for (int i = part1; i < len; i++) {
            sum2 += arr[i];
            part2 = i + 1;
            if (sum2 == target) break;
        }
        if (part2 == len) return false;
        int sum3 = 0;
        for (int i = part2; i < len; i++) {
            sum3 += arr[i];
        }
        
        return sum3 == target;
    }
}