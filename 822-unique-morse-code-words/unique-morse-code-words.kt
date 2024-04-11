	class Solution {
		fun uniqueMorseRepresentations(words: Array<String>): Int {
			val morse = arrayOf(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..")
			val set = mutableSetOf<String>()
			for (word in words) {
				val sb = StringBuilder()
				for (c in word) {
					sb.append(morse[c - 'a'])
				}
				set.add(sb.toString())
			}
			return set.size

		}
	}