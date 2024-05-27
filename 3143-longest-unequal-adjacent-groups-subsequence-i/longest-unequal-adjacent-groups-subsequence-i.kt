class Solution {
    fun getLongestSubsequence(words: Array<String>, groups: IntArray): List<String> {
        val n = words.size
        
        // 각 인덱스에서 끝나는 가장 긴 교대 부분 수열의 길이와 경로를 저장할 DP 배열
        val dp = Array(n) { Pair(1, listOf(it)) }
        
        // dp 배열을 채워나감
        for (i in 1 until n) {
            for (j in 0 until i) {
                if (groups[i] != groups[j] && dp[j].first + 1 > dp[i].first) {
                    dp[i] = Pair(dp[j].first + 1, dp[j].second + i)
                }
            }
        }
        
        // 가장 긴 교대 부분 수열을 찾음
        val longestSubsequence = dp.maxByOrNull { it.first }?.second ?: listOf()
        
        // 해당 인덱스를 words 배열로 변환하여 반환
        return longestSubsequence.map { words[it] }
    }
}