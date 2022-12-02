class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }
        int pow = biLog(n);
        return n == (int)Math.pow(2, pow);
    }
    
    private int biLog(int logNumber) {
       return (int)(Math.log(logNumber) / Math.log(2));
    }
}