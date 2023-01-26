import java.io.*
import java.util.*

object Main {
    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val br = BufferedReader(InputStreamReader(System.`in`))
        val sc = Scanner(br)
        val N = sc.nextInt()
        val array = arrayOfNulls<Int>(N)
        //for문의 조건에는 주로 범위 연산자인 in을 사용합니다.
        //ex) for (i in 1 until 10) { ... } -> 1부터 9까지 1씩 증가(10은 미포함)
        for (i in 0 until N) {
            array[i] = sc.nextInt()
        }
        Arrays.sort(array, Collections.reverseOrder())
        val bw = BufferedWriter(OutputStreamWriter(System.out))
        for (i in 0 until N) {
            bw.write(Integer.toString(array[i]!!))
            bw.write("\n")
        }
        bw.close()
        br.close()
    }
}