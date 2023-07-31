class Solution {
    fun judgeCircle(moves: String): Boolean {
        if(moves.length%2==1) return false
        val U = moves.count{ it == 'U' }
        val D = moves.count{ it == 'D' }
        if(U!=D) return false
        val L = moves.count{ it == 'L' }
        val R = moves.count{ it == 'R' }
        if(L!=R) return false
        return true
    }
}