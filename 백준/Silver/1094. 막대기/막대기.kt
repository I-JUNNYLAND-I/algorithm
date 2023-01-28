import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()

    // n을 이진법으로 만든다
    val binary = n.toString(2)

    val count = binary.split("")
        .filter { it == "1" }
        .count()
    println("${count}")
}