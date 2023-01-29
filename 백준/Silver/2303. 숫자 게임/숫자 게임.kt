import java.util.*


fun main() = with(System.`in`.bufferedReader()) {

    val member = readLine().toInt()

    val list = ArrayList<Int>()

    for (i in 0 until member) {
        val st = StringTokenizer(readLine())
        val nowList = ArrayList<Int>()
        for (j in 0..4) {
            nowList.add(st.nextToken().toInt())
        }
        var max = 0
        for (j in 0..2) {
            for (k in j + 1..3) {
                for (l in k + 1..4) {
                    val point = (nowList[j] + nowList[k] + nowList[l]) % 10
                    if (max < point) {
                        max = point
                    }
                }
            }
        }
        list.add(max)
    }
    val result = Collections.max(list)

    for (i in list.indices.reversed()) {
        if (result == list[i]) {
            println(i + 1)
            return
        }
    }

}