fun moreThenFirst(first: String, readLine: String?): Boolean {
    val firstSplit = first.split(" ")
    val inputSplit = readLine?.split(" ")!!
    
    if (firstSplit[3].toInt() < inputSplit[3].toInt()) return true
    if (firstSplit[3].toInt() == inputSplit[3].toInt() && firstSplit[2].toInt() < inputSplit[2].toInt()) return true
    if (firstSplit[3].toInt() == inputSplit[3].toInt() && firstSplit[2].toInt() == inputSplit[2].toInt() && firstSplit[1].toInt() < inputSplit[1].toInt()) return true

    return false
}

fun moreThenLast(last: String, readLine: String?): Boolean {
    val lastSplit = last.split(" ")
    val inputSplit = readLine?.split(" ")!!

    if (lastSplit[3].toInt() > inputSplit[3].toInt()) return true
    if (lastSplit[3].toInt() == inputSplit[3].toInt() && lastSplit[2].toInt() > inputSplit[2].toInt()) return true
    if (lastSplit[3].toInt() == inputSplit[3].toInt() && lastSplit[2].toInt() == inputSplit[2].toInt() && lastSplit[1].toInt() > inputSplit[1].toInt()) return true

    return false
}

fun main() = with(System.`in`.bufferedReader()) {

    val count = readLine().toInt()

    var first = "name 1 1 1989"
    var last = "name 31 12 2011"

    for (i in 1..count) {
        val readLine = readLine()
        if (moreThenFirst(first, readLine))
            first = readLine
        if (moreThenLast(last, readLine))
            last = readLine
    }

    println(first.split(" ")[0])
    println(last.split(" ")[0])


}
