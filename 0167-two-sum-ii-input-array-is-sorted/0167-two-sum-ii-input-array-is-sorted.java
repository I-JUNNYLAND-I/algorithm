class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // 오름차순으로 정렬된 Numbers 배열이 주어진다 .
        // two sum이 target과 같아지는 두 숫자의 위치값을 반환해라 
        int pL = 0;
        int pR = numbers.length - 1;
        while (pL < pR) {
            int temp = numbers[pL] + numbers[pR];
            if (temp == target) return new int[]{pL + 1, pR + 1};
            if (temp > target) pR--;
            else pL++;
        }
        return new int[]{pL + 1, pR + 1};
    }
}