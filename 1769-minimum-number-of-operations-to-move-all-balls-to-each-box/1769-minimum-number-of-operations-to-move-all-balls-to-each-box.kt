import kotlin.math.abs

class Solution {
    fun minOperations(boxes: String): IntArray {
        val len = boxes.length
        val ans = IntArray(len)
        for (i in  0..len - 1){
            if(boxes[i] == '1'){
                for(j in  0..len - 1){
                    ans[j] += abs(i-j)
                }
            }
        }
        return ans
    }
}