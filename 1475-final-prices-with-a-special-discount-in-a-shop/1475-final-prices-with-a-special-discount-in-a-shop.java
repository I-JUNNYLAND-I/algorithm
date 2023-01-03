class Solution {
    public int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length; i++) {
            int pointer = i + 1;    
            while(pointer < prices.length) {
                if (prices[i] >= prices[pointer]) {
                    prices[i] -= prices[pointer];  
                    break;
                } 
                pointer++;
            }
        }
        return prices;
    }
}