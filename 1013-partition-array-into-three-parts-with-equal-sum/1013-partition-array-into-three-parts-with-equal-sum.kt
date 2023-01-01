class Solution {
    fun canThreePartsEqualSum(arr: IntArray): Boolean {
        var sum = 0
        var partitionCount = 0
        var leftSum = 0
        var isAllElementZero = true
        for (num in arr) {
            sum += num
            if (num != 0) {
                isAllElementZero = false
            }
        }
        if (isAllElementZero) return true
        for (num in arr) {
           leftSum += num
            if (partitionCount < 3) {
                if (leftSum == sum/3) {
                    partitionCount++
                    leftSum = 0
                } 
            }
        }
        return (partitionCount == 3 && leftSum == 0)
    }
}