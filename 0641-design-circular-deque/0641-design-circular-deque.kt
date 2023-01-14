class MyCircularDeque(private val k: Int) {
        private val array: Deque<Int> = LinkedList()

        fun insertFront(value: Int): Boolean {
            if (!isPossibleInsert())
                return false
            array.addFirst(value)
            return true
        }

        private fun isPossibleInsert(): Boolean = array.size < k


        fun insertLast(value: Int): Boolean =
            if (!isPossibleInsert())
                false
            else {
                array.addLast(value)
                true
            }


        fun deleteFront(): Boolean =
            if (array.isEmpty())
                false
            else {
                array.removeFirst()
                true
            }


        fun deleteLast(): Boolean =
            if (array.isEmpty())
                false
            else {
                array.removeLast()
                true
            }

        fun getFront(): Int =
            if (array.isEmpty())
                -1
            else array.first


        fun getRear(): Int =
            if (array.isEmpty())
                -1
            else array.last

        fun isEmpty(): Boolean =
            array.isEmpty()

        fun isFull(): Boolean = array.size == k
    }