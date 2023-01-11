class Solution {
fun minSwaps(s: String): Int {
    val st = Stack<Char>()
    var count = 0
    val n = s.length
    for (i in 0 until n) {
        if (s[i] == ']') {
            if (!st.isEmpty() && st.peek() == '[') {
                st.pop()
            } else {
                count++
            }
        } else {
            st.push(s[i])
        }
    }
    return (count + 1) / 2
}
}