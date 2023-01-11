class Solution {
    fun validateStackSequences(pushed: IntArray, popped: IntArray): Boolean {
        val stack = Stack<Int>()
        var i = 0
        pushed.forEach { push ->
            stack.push(push)
            while (i < pushed.size 
                   && !stack.empty() 
                   && popped[i] == stack.peek()) {
                stack.pop()
                i ++
            }
        }
        return i == pushed.size
    }
}