class Solution {
	fun numberOfLines(widths: IntArray, s: String): IntArray {
		val res = IntArray(26)
		var sum = 0
		for (i in s.indices) {
			val width = widths[s[i] - 'a']
			if (sum + width > 100) {
				res[0]++
				sum = width
			} else {
				sum += width
			}
		}
		return intArrayOf(res[0] + 1, sum)
	}
}