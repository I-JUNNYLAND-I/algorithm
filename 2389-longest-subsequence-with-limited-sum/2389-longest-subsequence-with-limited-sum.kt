class Solution {
fun answerQueries(nums: IntArray, queries: IntArray): IntArray {
    nums.sort()
    for (i in 1..nums.lastIndex) nums[i] += nums[i-1]
    return IntArray(queries.size) {
        val search = nums.binarySearch(queries[it])
        if (search < 0)-search-1 else search+1
    }
}
}