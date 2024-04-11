	class Solution {
		fun minSteps(s: String, t: String): Int {
			val sMap = mutableMapOf<Char, Int>()
			val tMap = mutableMapOf<Char, Int>()
			for (i in s.indices) {
				sMap[s[i]] = sMap.getOrDefault(s[i], 0) + 1
				tMap[t[i]] = tMap.getOrDefault(t[i], 0) + 1
			}
			var res = 0
			for (c in sMap.keys) {
				if (sMap[c]!! > tMap.getOrDefault(c, 0)) {
					res += sMap[c]!! - tMap.getOrDefault(c, 0)
				}
			}
			return res
		}
	}