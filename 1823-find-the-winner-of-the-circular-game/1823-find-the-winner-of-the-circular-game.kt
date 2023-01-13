class Solution {
    fun findTheWinner(n: Int, k: Int): Int {
        var answer = 0
        for (i in 1..n)
            answer = (answer + k) % i;
        return answer + 1;
    }
}