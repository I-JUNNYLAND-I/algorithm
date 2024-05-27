class Solution {
    fun minMovesToSeat(seats: IntArray, students: IntArray): Int {
        seats.sort()
        students.sort()
        var res = 0
        for (i in seats.indices) {
            res += Math.abs(seats[i] - students[i])
        }
        return res
    }
}