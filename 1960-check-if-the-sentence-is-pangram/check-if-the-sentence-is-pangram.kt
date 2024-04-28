	class Solution {
		fun checkIfPangram(sentence: String): Boolean {
			val alphabet = "abcdefghijklmnopqrstuvwxyz"
			for (c in alphabet) {
				if (!sentence.contains(c)) {
					return false
				}
			}
			return true
		}
	}

