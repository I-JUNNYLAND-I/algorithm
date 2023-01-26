import java.io.BufferedReader
import java.util.*
object Main {
    fun gcd(a: Long, b: Long): Long {
        var a = a
        var b = b
        while (b != 0L) {
            val r = a % b
            a = b
            b = r
        }
        return a
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val a = sc.nextInt().toLong()
        val b = sc.nextInt().toLong()
        val answer = a * b / gcd(a, b)
        println(answer)
    }
}