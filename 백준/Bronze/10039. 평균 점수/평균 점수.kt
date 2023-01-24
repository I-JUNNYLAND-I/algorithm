fun main() {
    var sum = 0
    for(i in 1..5){
        sum += readLine()!!.toInt()
            .let { if (it < 40) 40 else it }
    }

    println(sum/5)
}