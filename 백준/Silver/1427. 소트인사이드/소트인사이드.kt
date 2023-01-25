fun main() {

    var answer = ""
    
    readln()
        .split("")
        .sorted()
        .reversed()
        .forEach { answer = answer.plus(it) }

    println(answer)
    
}