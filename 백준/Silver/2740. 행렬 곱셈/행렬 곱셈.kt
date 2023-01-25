import java.util.*


fun main() = with(System.`in`.bufferedReader()) {

    val sb = StringBuilder()

    var st = StringTokenizer(readLine(), " ")

    val N = st.nextToken().toInt()
    val M = st.nextToken().toInt()

    val A = Array(N) { IntArray(M) }

    for (i in 0 until N) {
        st = StringTokenizer(readLine(), " ")
        for (j in 0 until M) {
            A[i][j] = st.nextToken().toInt()
        }
    }

    st = StringTokenizer(readLine(), " ")
    st.nextToken()
    val K = st.nextToken().toInt()

    val B = Array(M) { IntArray(K) }

    for (i in 0 until M) {
        st = StringTokenizer(readLine(), " ")
        for (j in 0 until K) {
            B[i][j] = st.nextToken().toInt()
        }
    }
    for (i in 0 until N) {
        for (j in 0 until K) {
            var sum = 0
            for (k in 0 until M) {
                sum += A[i][k] * B[k][j]
            }
            sb.append(sum).append(' ')
        }
        sb.append('\n')
    }
    println(sb)
}