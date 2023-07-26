class Solution {
    private val car = arrayOf('M', 'G', 'P')
    fun garbageCollection(garbage: Array<String>, travel: IntArray): Int {

        var answer = 0

        car.forEach { car ->
            var number = 0
            garbage.forEachIndexed { index, garbage ->
                if (garbage.contains(car)) {
                    number = index
                    answer += garbage.split("")
                        .filter { it == car.toString() }
                        .size
                }
            }
            if (number != 0) {
                travel.forEachIndexed { index, i ->
                    if (number > index) {
                        answer += i
                    }
                }
            }
        }


        return answer
    }
}