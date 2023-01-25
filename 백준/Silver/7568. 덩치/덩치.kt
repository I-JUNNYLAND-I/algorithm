fun main() {

    val count = readln().toInt()

    val arr = Array(count) { IntArray(2) }
    var answer = ""

    for (i in 0 until count) {
        val (width, height) = readln().split(" ").map { it.toInt() }
        arr[i][0] = width
        arr[i][1] = height
    }

    for (i in 0 until count) {

        var rank = 1

        for (j in 0 until count) {
            if (i == j) continue
            if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                rank++
            }
        }
        answer = answer.plus(rank)
            .plus(" ")
    }
    println(answer.trim())

}