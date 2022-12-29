class Solution {
    fun answerQueries(nums: IntArray, queries: IntArray): IntArray {
       nums.sort() 
       for (i in 1..nums.lastIndex) nums[i] += nums[i-1]
       return IntArray(queries.size) {
           val ind = nums.binarySearch(queries[it])
           if (ind < 0) -ind-1 else ind+1
       }
    }
}