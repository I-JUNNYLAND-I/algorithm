import java.util.stream.IntStream


class Solution {
fun shuffle(nums: IntArray, n: Int): IntArray {
    val result = IntArray(nums.size)

    for (i in 0 until n) {
        result[2*i] = nums[i]
        result[2*i+1] = nums[i+n]
    }
    return result
}
}