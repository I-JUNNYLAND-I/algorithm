	class Solution {
		fun shortestCompletingWord(licensePlate: String, words: Array<String>): String {
			val licensePlate = licensePlate.toLowerCase().filter { it.isLetter() }
			val map = licensePlate.groupingBy { it }.eachCount()
			return words.filter { word ->
				val wordMap = word.groupingBy { it }.eachCount()
				map.all { (key, value) -> wordMap.getOrDefault(key, 0) >= value }
			}.minByOrNull { it.length }!!
		}
	}

