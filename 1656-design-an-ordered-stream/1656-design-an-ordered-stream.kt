class OrderedStream(n: Int) {
    private var orderedStreamArray: Array<String> = Array(n) { "0" }
    private var pointer = 0

    fun insert(idKey: Int, value: String): List<String> {
        orderedStreamArray[idKey-1] = value
        val tempList = orderedStreamArray.takeWhile { it != "0"  }.toList()
        return tempList.drop(pointer).apply { pointer = tempList.size }
    }

}