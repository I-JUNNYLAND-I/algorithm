fun main() = with(System.`in`.bufferedReader()) {
    val count = readLine().toInt()
    println(count * (count - 1) * (count - 2) * (count - 3) / 24)
}