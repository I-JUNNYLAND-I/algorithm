import java.io.BufferedReader

// buffered reader
fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = this.readLine()
    // to Long
    n.split("").sortedDescending().joinTo(StringBuilder(), separator = "").let(::println)
}