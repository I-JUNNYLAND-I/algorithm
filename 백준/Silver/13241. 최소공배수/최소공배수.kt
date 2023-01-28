fun main() = with(System.`in`.bufferedReader()) {

    val (left, right) = readLine().split(" ").map { it.toLong() }

    val lsm: Long = greatestCommonDivisor(left, right)
    println(left * right / lsm)
}

fun greatestCommonDivisor(left: Long, right: Long): Long {
    return if (left % right == 0L) right
    else greatestCommonDivisor(right, left % right)
}
