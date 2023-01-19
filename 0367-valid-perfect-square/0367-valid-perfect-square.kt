class Solution {
    fun isPerfectSquare(num: Int): Boolean {
        var s = 0
        var e = num
        while(s<=e){
            val mid = s+(e-s)/2
            val sqr:Long = mid.toLong()*mid.toLong()
            if(sqr == num.toLong()) return true
            else if (sqr< num.toLong()) s = mid+1
            else e = mid-1
        }
        return false
    }
}