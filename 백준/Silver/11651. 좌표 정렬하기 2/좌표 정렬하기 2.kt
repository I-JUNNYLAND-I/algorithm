fun main() {

    val count = readln().toInt()

    val arr = Array(count) { IntArray(2) }

    for (i in 0 until count) {
        val (x, y) = readln().split(" ").map { it.toInt() }
        arr[i][0] = x
        arr[i][1] = y
    }

    arr.sortWith { o1, o2 -> if (o1[1] - o2[1] == 0) o1[0] - o2[0] else o1[1] - o2[1] }

    for ((index, ints) in arr.withIndex()) {
        println("${ints[0]} ${ints[1]}")
    }

}