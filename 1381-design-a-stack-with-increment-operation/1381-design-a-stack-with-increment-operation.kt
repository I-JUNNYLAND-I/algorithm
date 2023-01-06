class CustomStack(private val maxSize: Int) {

    private val stack: IntArray = IntArray(maxSize)
    private var size = -1

    fun push(x: Int) {
        if (isFull()) {
            return
        }
        stack[++size] = x
    }

    private fun isFull(): Boolean {
        return size >= stack.size - 1
    }

    fun pop(): Int {
        if (isEmpty()) {
            return -1
        }
        return stack[size--]
    }

    private fun isEmpty(): Boolean {
        return size == -1
    }
      
      
      fun increment(k: Int, `val`: Int) {
              
        if (isEmpty()) return
              
        if (k > maxSize) {
            for (i in stack.indices) {
                stack[i] = stack[i] + `val`
            }
        } else {
            for (i in 0 until (k % maxSize)) {
                stack[i] = stack[i] + `val`
            }
        }
     
    }

}