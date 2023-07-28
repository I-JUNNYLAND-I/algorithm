class Solution {
    fun restoreIpAddresses(s: String): List<String> {
        val res = mutableListOf<String>()
        dfs(s, 0, "", res)
        return res
    }

    fun dfs(str: String, index:Int, path: String, res: MutableList<String>) {
        if (index == 4) {
            if (str.isEmpty()) res.add(path.substring(1))
            return
        }
        for (i in 1..3) {
            if (str.length < i) break
            val sub = str.substring(0, i).toInt()
            if (sub > 255 || i != sub.toString().length) continue
            dfs(str.substring(i), index + 1, "$path.$sub", res)
        }
    }
}