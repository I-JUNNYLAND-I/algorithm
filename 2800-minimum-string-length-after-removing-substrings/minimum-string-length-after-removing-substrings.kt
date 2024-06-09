class Solution {
    fun minLength(s: String): Int {
        val stack = Stack<Char>()

        for (i in s) {
            if (i == 'B') {
                if (!stack.empty() && stack.peek() == 'A') stack.pop()
                else stack.push(i)
            } else if (i == 'D') {
                if (!stack.empty() && stack.peek() == 'C') stack.pop()
                else stack.push(i)
            } else {
                stack.push(i)
            }
            // println(stack)
        }
        return stack.size
    }
}