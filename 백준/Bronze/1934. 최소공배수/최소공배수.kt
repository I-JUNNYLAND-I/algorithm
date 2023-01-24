fun main() {
    val count = readln().toInt()

    for(i in 1..count){
        val (first,second) = readln().split(" ").map { it.toInt() }
        // 최소 공배수
        val lcm = lcm(first,second)
        println(lcm)
    }

}
fun lcm(a: Int, b: Int): Int {
    return a * b / gcd(a, b)
}
fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}
