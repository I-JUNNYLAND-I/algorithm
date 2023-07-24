import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maxArea(height: IntArray): Int {
        var maxContainer = 0
        var left = 0
        var right = height.size - 1
        while (left< right){
            val tempMax = (right - left) * min(height[left], height[right])
            maxContainer = max(maxContainer, tempMax)
            if(height[left] >= height[right]){
                right -=1
            }else{
                left+=1
            }
        }
        return maxContainer
    }
}