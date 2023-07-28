class Solution {
    fun restoreIpAddresses(s: String): List<String> {
        val result = ArrayList<ArrayList<String>>()
        val t = ArrayList<String>()
        dfs(result, s, 0, t)
        val finalResult = ArrayList<String>()
        for (l in result) {
            val sb = StringBuilder()
            for (str in l) {
                sb.append("$str.")
            }
            sb.setLength(sb.length - 1)
            finalResult.add(sb.toString())
        }
        return finalResult
    }

    private fun dfs(result: ArrayList<ArrayList<String>>, s: String, start: Int, t: ArrayList<String>) {
        //if already get 4 numbers, but s is not consumed, return
        if (t.size >= 4 && start != s.length) return

        //make sure t's size + remaining string's length >=4
        if (t.size + s.length - start + 1 < 4) return

        //t's size is 4 and no remaining part that is not consumed.
        if (t.size == 4 && start == s.length) {
            val temp = ArrayList(t)
            result.add(temp)
            return
        }
        for (i in 1..3) {
            //make sure the index is within the boundary
            if (start + i > s.length) break
            val sub = s.substring(start, start + i)
            //handle case like 001. i.e., if length > 1 and first char is 0, ignore the case.
            if (i > 1 && s[start] == '0') {
                break
            }

            //make sure each number <= 255
            if (sub.toInt() > 255) break
            t.add(sub)
            dfs(result, s, start + i, t)
            t.removeAt(t.size - 1)
        }
    }
}