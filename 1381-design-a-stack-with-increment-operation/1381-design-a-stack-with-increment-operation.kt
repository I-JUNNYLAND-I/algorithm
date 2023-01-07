class CustomStack(private val maxSize: Int) {

    private var array: IntArray = IntArray(maxSize)

    fun push(x: Int) {
        val depth = array.filter { it != 0 }.size
        if (depth != maxSize)
            array[depth] = x
    }

    fun pop(): Int {
        val size = array.filter { it != 0 }.size
        return if (size != 0) {
            val value = array[size - 1]
            array[size - 1] = 0
            value
        } else {
            -1
        }
    }

    fun increment(k: Int, `val`: Int) {
        val size = array.filter { it != 0 }.size
        if (size == 0) {
            return
        }
        if (size < k) {
            for (i in 0 until size) {
                array[i] += `val`
            }
        } else {
            for (i in 0 until k) {
                array[i] += `val`
            }
        }
    }

}