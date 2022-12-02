class Solution {
    
    public int addDigits(int num) {
        return sumDigits(num);    
    }

    int sumDigits(int num) {
       if(num <= 9) {
           return num;
       }
        
        num = num%10 + sumDigits(num/10);
        
        return sumDigits(num);
    }
    
}