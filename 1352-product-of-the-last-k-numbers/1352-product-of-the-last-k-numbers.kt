class ProductOfNumbers(
    private val list:ArrayList<Int> = ArrayList()
) {

    fun add(num: Int) {
        list.add(num)
    }

    fun getProduct(k: Int): Int {
        val copyList = list.toList()
        val reverseList = copyList.reversed()

        var answer = 1
        for (index in 0 until k) {
            answer *= reverseList[index]
        }

        return answer
    }

}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * var obj = ProductOfNumbers()
 * obj.add(num)
 * var param_2 = obj.getProduct(k)
 */