fun main() {
    val list: ArrayList<Int> = ArrayList()

    val loop = readln().toInt()

    for (index in 1..loop) {
        val (first, second) = readln().split(" ").map { it.toInt() }
        val gcd = gcd(second, first)
        if (gcd != 0) list.add(first * second / gcd)
        else list.add(first * second)
    }

    for (i in list) {
        println(i)
    }

}

fun gcd(first: Int, second: Int): Int =
    if (first % second == 0) second else gcd(second, first % second)

