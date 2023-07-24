class Solution {
    fun isUgly(n: Int): Boolean {
        if(n==0) return false
        var res = n
        while(res!=1){
            if(res%2 == 0){
               res = res/2
                continue
           }
            if(res%3 == 0){
               res = res/3
                continue
           }
            if(res%5 == 0){
               res = res/5
                continue
           }
            return false
        }
        return true
    }   
}