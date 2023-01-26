fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    val (e, s, m) = readLine().split(" ").map { it.toInt() }

    var ecopy = 1
    var scopy = 1
    var mcopy = 1
    var count = 1

    while (true) {
        if (e == ecopy && s == scopy && m == mcopy) break
        ecopy++; scopy++; mcopy++; count++
        if (ecopy > 15) ecopy = 1
        if (scopy > 28) scopy = 1
        if (mcopy > 19) mcopy = 1
    }

    println(count)
}