fun main() {

    var x = readln().toInt()

    var answer = 0

    while (x != 0) {

        when {
            x >= 64 -> {
                x -= 64
                answer += 1
            }

            x >= 32 -> {
                x -= 32
                answer += 1
            }

            x >= 16 -> {
                x -= 16
                answer += 1
            }

            x >= 8 -> {
                x -= 8
                answer += 1
            }

            x >= 4 -> {
                x -= 4
                answer += 1
            }

            x >= 2 -> {
                x -= 2
                answer += 1
            }

            x >= 1 -> {
                x -= 1
                answer += 1
            }
        }
    }
    println(answer)

}