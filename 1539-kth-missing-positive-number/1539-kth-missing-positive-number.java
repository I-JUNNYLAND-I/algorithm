class Solution {
    public int findKthPositive(int[] arr, int k) {
        int[] temp = new int[2_001];
        for(int i = 0; i < temp.length; i++) temp[i] = i;
        for(int num : arr) temp[num] = 0;
        int count = 0;
        for(int num : temp) {
            if (num != 0) count++;
            if (count == k) return num;
        }
        return 0;
    }
}