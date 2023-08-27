class Solution {
    fun sortString(s: String): String {
        val arr = IntArray(26)

        for (i in 0 until s.length) {
            val index: Int = s[i] - 'a'
            arr[index] = arr[index] + 1
        }

        // System.out.print(Arrays.toString(arr));


        // System.out.print(Arrays.toString(arr));
        val sb = StringBuilder()
        while (sb.length < s.length) {
            for (i in 0..25) {
                if (arr[i] > 0) {
                    val ch = ('a' + i)
                    sb.append(ch)
                    arr[i]--
                }
            }
            for (i in 25 downTo 0) {
                if (arr[i] > 0) {
                    val ch = ('a' + i)
                    sb.append(ch)
                    arr[i]--
                }
            }
        }

        return sb.toString()
    }
}