import java.util.*


class Solution {
    fun removeOuterParentheses(s: String): String {

        val stack = Stack<Char>()
        val list: MutableList<Int> = ArrayList()
        val sb = StringBuilder()

        for (i in s.indices) {
            val currentChar: Char = s[i]
            if (stack.isEmpty()) {
                list.add(i)
                stack.push(currentChar)
            } else if (stack.peek() == '(' && currentChar == ')' || stack.peek() == ')' && currentChar == '(') {
                stack.pop()
                if (stack.isEmpty()) {
                    list.add(i)
                }
            } else {
                stack.push(currentChar)
            }
        }
        var i = 0
        while (i < list.size) {
            val startIdx = list[i]
            val endIdx = list[i + 1]
            sb.append(s.substring(startIdx + 1, endIdx))
            i += 2
        }


        return sb.toString()

    }
}