import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (n, k) = readLine().split(" ")

    val data = IntArray(n.toInt())

    var result = "<"
    var circle = 0
    var count = 0
    var pointer = 0
    while (count != n.toInt()) {
        if (data[pointer] == 0) {
            circle++
        }
        if (circle == k.toInt()) {
            data[pointer] = 1
            count++
            circle = 0
            result += "${pointer + 1}, "
        }
        if (pointer == n.toInt() - 1) {
            pointer = 0
        } else {
            pointer++
        }
    }
    println(result.substring(0, result.length - 2) + ">")
}