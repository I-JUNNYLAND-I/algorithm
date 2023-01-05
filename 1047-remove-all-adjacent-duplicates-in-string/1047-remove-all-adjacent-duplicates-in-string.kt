class Solution {
fun removeDuplicates(s: String): String = Stack<Char>().apply {
        s.forEach {
            if (isEmpty() || peek() != it) {
                push(it)
            } else {
                pop()
            }
        }
        return joinToString("")
    }.toString()
}