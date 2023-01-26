import java.util.UUID

fun main() = with(System.`in`.bufferedReader()) {
    
    
    val (count, k) = readLine().split(" ").map { it.toInt() }

    println(readLine().split(" ").map { it.toInt() }.sorted()[k - 1])

    
}