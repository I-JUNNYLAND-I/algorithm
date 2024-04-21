class Solution {
    fun countPoints(points: Array<IntArray>, queries: Array<IntArray>): IntArray {
        val res = IntArray(queries.size)

        for (ind in queries.indices) {
            points.forEach { point ->
                if (isInside(point[0], queries[ind][0], point[1], queries[ind][1], queries[ind][2])) {
                    res[ind] += 1
                }
            }
        }
        return res
    }
        
    fun isInside(x1: Int, x2: Int, y1: Int, y2: Int, r: Int): Boolean {
        return (x1 - x2).pow(2) + (y1 - y2).pow(2) <= r.pow(2)
    }

    fun Int.pow(grade: Int): Int {
        return if (grade > 1) this * this.pow(grade - 1) else this
    }
}