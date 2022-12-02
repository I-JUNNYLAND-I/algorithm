class Solution {
    public int addDigits(int num) {
        if (num == 0 ) return 0;
        int p = Integer.toString(num).length() - 1;
        int temp;
        int n = num;
        while(true) {
            temp = 0;
            for(int i = p; i >= 0; i--) {
                int pow = (int)Math.pow(10, i);
                temp += n / pow;
                n = n % pow;
            }
            n = temp;
            if (temp < 10) {
                break;
            }
        }
        return temp;
    }
}