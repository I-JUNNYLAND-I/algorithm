class Solution {
fun findKthPositive(arr: IntArray, k: Int): Int {
    var missing = 0
    var i = 0
    var j = 1
    while (missing < k) {
        if (i < arr.size && arr[i] == j) {
            i++
        } else {
            missing++
        }
        j++
    }
    return j - 1

}
}