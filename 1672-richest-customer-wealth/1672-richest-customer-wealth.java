class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int[] subAccount = new int[accounts[0].length];

        for(int[] customer : accounts) {
            int currentCustomerWealth = 0;
            for(int bank : customer) {
                currentCustomerWealth += bank;
            }
            max = Math.max(max, currentCustomerWealth);
        }

        return max;
    }
}