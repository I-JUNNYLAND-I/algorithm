class Solution {
    fun numberOfBeams(bank: Array<String>): Int {
        var res = 0
        var p1 = 0
        var p2 = 1
        while(p2 < bank.size) {
            val p2Count = bank[p2].count{ it == '1' } 
            if(p2Count > 0) {
                res += bank[p1].count { it == '1' }.times(p2Count)
                p1 = p2
            } 
                p2++
        }
        return res
    }
}