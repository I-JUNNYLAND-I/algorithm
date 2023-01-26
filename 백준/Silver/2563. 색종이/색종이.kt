import java.io.BufferedReader

// 100 x 100 2차원 배열
val arr = Array(100) { IntArray(100) }

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()

    for (i in 1..n){
        val (x,y) = readLine().split(" ")

        for (j in x.toInt() until x.toInt()+10){
            for (k in y.toInt() until y.toInt()+10){
                arr[j][k]++
            }
        }
    }
    var cnt = 0
    for (i in 0..99){
        for (j in 0..99){
            if (arr[i][j] > 0) cnt++
        }
    }
    println(cnt)
}