class Solution {
fun countDistinctIntegers(nums: IntArray): Int {
    nums.sort()
    var count = HashMap<Int, Int>()
    
    nums.forEach { num -> 
        count.put(num, count.getOrDefault(num, 0) + 1)
    }
    nums.forEach { num -> 
        val reverse = num.toString().reversed().toInt()
        count.put(reverse, count.getOrDefault(reverse, 0) + 1)
    }
    return count.size
}
}