import java.util.*


private lateinit var check: BooleanArray
private lateinit var arr: Array<IntArray>
private var count = 0
private var node = 0
private var line = 0
var q: Queue<Int> = LinkedList()
fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    node = readLine().toInt()
    line = readLine().toInt()
    arr = Array(node + 1) { IntArray(node + 1) }
    check = BooleanArray(node + 1)
    for (i in 0 until line) {
        val str = StringTokenizer(readLine())
        val a = str.nextToken().toInt()
        val b = str.nextToken().toInt()
        arr[b][a] = 1
        arr[a][b] = arr[b][a]
    }
    dfs(1)
    println(count - 1)
}

private fun dfs(start: Int) {
    check[start] = true
    count++
    for (i in 0..node) {
        if (arr[start][i] == 1 && !check[i]) dfs(i)
    }
}