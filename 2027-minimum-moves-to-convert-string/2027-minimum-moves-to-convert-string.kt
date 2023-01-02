class Solution {
   fun minimumMoves(s: String): Int {
        var move = 0
        var i = 0
        while (i < s.length) {
            i += if (s[i] == 'X') {
                move++
                3
            } else 1
        }

        return move
    }
}