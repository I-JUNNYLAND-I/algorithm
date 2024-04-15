	class Solution {
		fun getHappyString(n: Int, k: Int): String {
			val res = StringBuilder()
			val chars = charArrayOf('a', 'b', 'c')
			var count = 0
			fun dfs(s: String) {
				if (s.length == n) {
					count++
					if (count == k) {
						res.append(s)
					}
					return
				}
				for (c in chars) {
					if (s.isEmpty() || s.last() != c) {
						dfs(s + c)
					}
				}
			}
			dfs("")
			return res.toString()
		}
	}