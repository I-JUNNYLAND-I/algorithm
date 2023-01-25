import java.util.*

fun main() {

    var (person, k) = readln().split(" ").map { it.toInt() }

    val list: Queue<Int> = LinkedList()
    for (i in 1..person) {
        list.offer(i)
    }

    var answer = "<"

    while (list.size != 1) {
        for (i in 0 until k - 1) {
            list.offer(list.poll())
        }
        answer = answer.plus("${list.poll()}, ")
    }

    answer = answer.plus("${list.poll()}>")

    println(answer)

}