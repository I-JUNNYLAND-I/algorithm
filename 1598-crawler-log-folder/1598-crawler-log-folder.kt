class Solution {
fun minOperations(logs: Array<String>): Int {
        var counter = 0
        
        logs.forEach { log ->
            when (log) {
                "../" -> counter = maxOf(0, counter - 1)
                "./" -> Unit // Do nothing
                else -> counter++
            }
        }
        
        return counter
    }
}