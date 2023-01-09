class Solution {
    
    
    public int countDistinctIntegers(int[] nums) {
        //list 2개에 reverse한거 합치고, 셋으로 바꾼뒤 size구하기
        Set<Integer> set = new HashSet<>();
        
        for(int n: nums){
            set.add(n);
            set.add(reverse(n));
        }
        
        return set.size();
    }

    int reverse(int n){
        int reverseVal = 0;
        
        while(n != 0){
            int rem = n % 10;
            reverseVal = reverseVal* 10 + rem;
            n /= 10;
        }
        
        return reverseVal;
    }
}