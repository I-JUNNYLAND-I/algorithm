import java.util.LinkedList

var R = 0
var C = 0
var map = arrayOf<CharArray>()
var check = arrayOf<BooleanArray>()
var sheeps = 0
var wolves = 0

val dr = intArrayOf(0, 0, 1, -1)
val dc = intArrayOf(1, -1, 0, 0)

fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    readLine().split(" ").also {
        R = it[1].toInt()
        C = it[0].toInt()
    }

    map = Array(C) { readLine().toCharArray() }
    check = Array(C) { BooleanArray(R) }

    for (c in 0 until C) {
        for (r in 0 until R) {
            if (map[c][r] != '#' && !check[c][r]) {
                check[c][r] = true
                bfs(r, c)
            }
        }
    }

    println("$sheeps $wolves")
}

fun bfs(r: Int, c: Int) {
    var she = 0
    var wol = 0

    when(map[c][r]) {
        'o' -> she += 1
        'v' -> wol += 1
        else -> Unit
    }

    val q = LinkedList<Pair<Int, Int>>()
    q.add(Pair(r, c))

    while (q.isNotEmpty()) {
        val now = q.pop()

        for (i in 0 until 4) {
            val nr = now.first + dr[i]
            val nc = now.second + dc[i]

            if (nr !in 0 until R || nc !in 0 until C) continue
            if (map[nc][nr] == '#') continue
            if (check[nc][nr]) continue

            check[nc][nr] = true
            q.push(Pair(nr, nc))

            when(map[nc][nr]) {
                'o' -> she += 1
                'v' -> wol += 1
                else -> Unit
            }
        }
    }

    if (she > wol) {
        sheeps += she
    } else {
        wolves += wol
    }
}