import java.util.*

class RecentCounter() {
val requests = LinkedList<Int>()

fun ping(t: Int): Int {
    requests.add(t)

    val timeSpan = t - 3000..t
    while (requests.peek() !in timeSpan) {
        requests.poll()
    }

    return requests.size
}
}