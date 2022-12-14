class Solution {
fun calPoints(operations: Array<String>): Int {
    var stack = ArrayList<Int>()
    operations.forEach {
        when (it) {
            "+" -> {
                stack.add(stack[stack.size - 1] + stack[stack.size - 2])
            }
            "D" -> {
                stack.add(stack[stack.size - 1] * 2)
            }
            "C" -> {
                stack.removeAt(stack.size - 1)
            }
            else -> {
                stack.add(it.toInt())
            }
        }
    }
    return stack.sum()
}
}