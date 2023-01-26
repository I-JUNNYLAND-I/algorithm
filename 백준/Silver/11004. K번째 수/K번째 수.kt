import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (n,k) = readLine().split(" ")
    val datas = readLine().split(" ")

    val sorted = datas.map { it.toInt() }.sorted()
    println(sorted[k.toInt()-1])
}