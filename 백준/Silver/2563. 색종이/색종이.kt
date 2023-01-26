fun main() = with(System.`in`.bufferedReader()) {
    val count = readLine().toInt()
    val arr = Array(100) { IntArray(100) }
    for (i in 1..count) {
        val (x, y) = readLine().split(" ").map { it.toInt() }

        for (i1 in x until x + 10) {
            for (i2 in y until y + 10) {
                arr[i1][i2]++
            }
        }
    }

    var answer = 0

    for (i in 0 until 100) {
        for (i1 in 0 until 100) {
            if (arr[i][i1] > 0) answer++
        }
    }
    println(answer)
}