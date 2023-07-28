class Solution {
    fun longestPalindrome(s: String): String {
        var left = 0
        var right = 0
        for (i in s.indices) {
            var start = i
            var end = i
            while (start >= 0 && end <= s.lastIndex && s[start] == s[end]) {
                start--
                end++
            }
            if(--end - ++start > right - left) {
                left = start
                right = end
            }

            if (i == 0) continue

            start = i-1
            end = i
            while (start >= 0 && end <= s.lastIndex && s[start] == s[end]) {
                start--
                end++
            }
            if(--end - ++start > right - left) {
                left = start
                right = end
            }
        }
        return s.substring(left, right+1)
    }
}