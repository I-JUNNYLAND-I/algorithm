class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int alice = Arrays.stream(aliceSizes).sum();
        int bob = Arrays.stream(bobSizes).sum();
        int total = alice + bob;
        int aDiff = total / 2 - alice;
        for (int i = 0; i < aliceSizes.length; i++) {
            for (int j = 0; j < bobSizes.length; j++) {
                if (aliceSizes[i] + aDiff == bobSizes[j]) {
                     return new int[]{aliceSizes[i], bobSizes[j]};
                }
            }
        }
        return new int[]{0, 0};
    }
}