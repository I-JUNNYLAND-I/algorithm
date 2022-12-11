class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] change = new int[3];
        /** indices of each bill
        * 5$ is 0
        * 10$ is 1
        * 20$ is 2
        */
        for (int bill : bills) {
            if (bill == 5) {
                change[0]++;
            } else if (bill == 10) {
                if (change[0] > 0) {
                    change[1]++;
                    change[0]--;
                } else {
                    return false;
                }
            } else if (bill == 20) {
                if (change[1] > 0 && change[0] > 0) {
                    change[1]--;
                    change[0]--;
                } else if (change[1] == 0 && change[0] >= 3) {
                    change[0] -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}