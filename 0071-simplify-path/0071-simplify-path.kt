class Solution {
    fun simplifyPath(path: String): String {
        val stack = mutableListOf<String>()
        val arr = path.split("/").filter { it.isNotEmpty() }
        for (i in arr) {
            if (i == "..") {
                if (stack.isNotEmpty()) {
                    stack.removeAt(stack.size - 1)
                }
            } else if (i != ".") {
                stack.add(i)
            }
        }
        if (stack.isEmpty()) return "/"
        val res = StringBuilder()
        for (w in stack)
            res.append('/').append(w)
        return res.toString()
    }
}