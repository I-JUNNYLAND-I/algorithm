class Solution {
fun minPartitions(n: String): Int {
	var max = 0

	n.forEach { c ->
		max = maxOf(max, Character.getNumericValue(c))
		
	}

	return max
}
}