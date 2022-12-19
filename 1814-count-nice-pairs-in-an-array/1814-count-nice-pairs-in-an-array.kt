class Solution {
fun countNicePairs(nums: IntArray): Int {
    var res = 0
    val mod = 1e9.toInt() + 7
    var map: HashMap<Int, Int> = HashMap<Int, Int>()
    for(num in nums) {
        val diff = num - num.toString().reversed().toInt()
        val count = map.getOrDefault(diff, 0)
        map.put(diff, count + 1)
        res = (res + count) % mod
    }
    return res
}
}