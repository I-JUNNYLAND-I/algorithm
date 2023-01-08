import java.util.*


class Solution {
    fun smallestNumber(pattern: String): String {
        val sb = StringBuilder()
        val stack: Deque<Char> = LinkedList(mutableListOf('1'))

        for (c in pattern.toCharArray()) {
            var maxSorFar = stack.peek()
            if (c == 'I') while (!stack.isEmpty()) {
                maxSorFar = maxSorFar.coerceAtLeast(stack.peek()).toChar()
                sb.append(stack.poll())
            }
            stack.push((maxSorFar + 1))
        }

        while (!stack.isEmpty()) sb.append(stack.poll())

        return sb.toString()
    }
}