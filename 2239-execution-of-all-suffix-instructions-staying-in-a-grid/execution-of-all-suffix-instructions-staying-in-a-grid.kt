class Solution {
    fun executeInstructions(n: Int, startPos: IntArray, s: String): IntArray {
        val result = mutableListOf<Int>()
        for (i in s.indices){
            val command = s.substring(i)
            result.add(Matrix(n, startPos[1], startPos[0]).calculate(command))
        }
        return result.toIntArray()
    }
}

data class Matrix(val n: Int, var x: Int, var y: Int) {
    fun calculate(s: String): Int {
        var count = 0
        s.forEach {
            val move = map[it]!!
            val moveX = move[0]
            val moveY = move[1]

            if (x + moveX == n || x + moveX < 0 || y + moveY == n || y + moveY < 0) {
                return count
            }
            count++
            x += moveX
            y += moveY
        }
        return count
    }

    companion object {
        val map = mapOf(
            'U' to listOf(0, -1),
            'D' to listOf(0, 1),
            'L' to listOf(-1, 0),
            'R' to listOf(1, 0)
        )
    }

}

