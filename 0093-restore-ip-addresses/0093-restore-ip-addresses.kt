class Solution {
fun restoreIpAddresses(s: String): List<String> {
    val res = ArrayList<String>()

    fun isValid(s: String): Boolean {
        if (s[0] == '0') return s == "0"
        return s.toInt() <= 255
    }

    fun dfs(start: Int, path: String, index: Int, res: ArrayList<String>) {
        if (index > 4) return

        if (index == 4 && start == s.length) {
            res.add(path.dropLast(1))
            return
        }

        var num = ""
        val len = minOf(3, s.length - start)

        for (i in 0..len - 1) {
            num += s[start + i]
            if (isValid(num)) {
                dfs(start + i + 1, path + num + '.', index + 1, res)
            }
        }
    }

    dfs(0, "", 0, res)

    return res
}
}