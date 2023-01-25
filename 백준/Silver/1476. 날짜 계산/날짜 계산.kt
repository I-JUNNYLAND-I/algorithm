import java.util.*

fun main() {

    var (e, s, m) = arrayOf(1, 1, 1)

    val (E, S, M) = readln().split(" ").map { it.toInt() }

    var year = 0

    while (true) {
        if (e == E && s == S && m == M) {
            year++
            println(year)
            break
        }
        year++
        e++
        s++
        m++
        if (e == 16) e = 1
        if (s == 29) s = 1
        if (m == 20) m = 1
    }

}