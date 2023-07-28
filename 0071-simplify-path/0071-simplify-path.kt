class Solution {
      fun simplifyPath(path: String): String {
    val patterns = path.split("/").filter { it.isNotEmpty() }
    val st = mutableListOf<String>()
    for (p in patterns) {
      when (p) {
        "." -> {}
        ".." -> { if (st.isNotEmpty()) st.removeAt(st.size - 1) }
        else -> st.add(p)
      }
    }
    if (st.isEmpty()) return "/"
    val res = StringBuilder()
    for (w in st)
      res.append('/').append(w)
    return res.toString()
  }
}