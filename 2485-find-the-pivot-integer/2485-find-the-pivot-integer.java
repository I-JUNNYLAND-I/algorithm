class Solution {
    public int pivotInteger(int n) {
        double k = Math.sqrt((n * n + n) / 2);
        if (k - (int)k > 0) {
            return -1;
        }
        return (int)k;
        
    }
}