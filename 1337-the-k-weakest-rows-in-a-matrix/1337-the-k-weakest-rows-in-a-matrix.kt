class Solution {
    fun kWeakestRows(mat: Array<IntArray>, k: Int): IntArray = mat
        .mapIndexed { index, row -> Pair<Int, Int>(row.sum(), index) }
        .sortedWith( compareBy<Pair<Int, Int>> { it.first } )
        .map { it.second }
        .take(k)
        .toIntArray()
}