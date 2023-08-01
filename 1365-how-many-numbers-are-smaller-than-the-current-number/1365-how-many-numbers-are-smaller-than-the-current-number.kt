class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        val ans = mutableListOf<Int>()
        nums.forEach { it1 ->
            var count =0
            nums.forEach {it2->
                if(it1 > it2) count+=1
            }
            ans.add(count)
        }
        return ans.toIntArray()
    }
}