class Solution {
fun divideArray(nums: IntArray): Boolean {
    var map = HashMap<Int, Int>()
    nums.forEach {
        map[it] = map.getOrDefault(it, 0) + 1
    }
    map.forEach{
        if(it.value % 2 != 0){
            return false
        }
    }
    return true
}

}