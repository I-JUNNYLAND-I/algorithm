fun main() {
    var answer = 0
    for (index in 0..4) {
        val score = readln().toInt()
        if (score < 40) answer += 40
        else answer += score
    }
    println(answer / 5)
}