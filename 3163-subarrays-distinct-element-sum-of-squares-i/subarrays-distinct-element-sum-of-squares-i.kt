	class Solution {
fun sumCounts(l: List<Int>) = (1..l.size).sumOf { l.windowed(it).sumOf { val s = it.toSet().size; s * s } }
	}