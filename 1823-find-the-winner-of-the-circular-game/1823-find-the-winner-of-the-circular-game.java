class Solution {
    public int findTheWinner(int n, int k) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = i + 1;
        int i = 0;
        int count = 0;
        int countZero = 0;
        while (countZero < n - 1) {
            if (i > n - 1) i %= n;
            if (arr[i] != 0) count++;
            if (count == k) {
                arr[i] = 0;
                count = 0;
                countZero++;
            }
            i++;
        }
        for (int num : arr) {
            if (num != 0) return num;
        }
        return 0;
    }
}