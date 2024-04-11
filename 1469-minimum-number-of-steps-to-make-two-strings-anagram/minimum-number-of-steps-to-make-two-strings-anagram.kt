class Solution {
    fun minSteps(s: String, t: String): Int {
        val frequencies = s.asSequence()
            .groupingBy { it }
            .eachCount()
            .toMutableMap()

        t.forEach {
            val f = frequencies.getOrDefault(it, 0)
            if (f > 0) {
                frequencies[it] = f - 1
            }
        }
        return frequencies.values.sumOf { it }
    }
}
