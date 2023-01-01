class Solution {
    fun maxDistance(colors: IntArray): Int {
    var left = 0
    var right = colors.size-1
    var dist = 0
    var max = 0
	
    while(left<right) {
        if (colors[left]!=colors[right]) {
            if (dist<right-left && right-left>max) {
                max = right-left
            } else if (dist>=right-left && dist>max){
                max = dist
            }
        }
        right--
        dist++
    }
    return max
}
}