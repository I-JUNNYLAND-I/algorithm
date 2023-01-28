fun main() = with(System.`in`.bufferedReader()) {
    val count = readLine().toInt()

    val dp = Array(2) { IntArray(46) }

    dp[0][2] = 1
    dp[1][1] = 1
    dp[1][2] = 1

    for (i in 3..count) {
        dp[0][i] = dp[0][i - 2] + dp[0][i - 1]
        dp[1][i] = dp[1][i - 2] + dp[1][i - 1]
    }
    println("${dp[0][count]} ${dp[1][count]}")

}
