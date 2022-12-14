class NumArray(val nums: IntArray) {

    fun sumRange(i: Int, j: Int): Int {
        var sum = 0
        for(index in i..j) {
            sum+= nums[index]
        }
        return sum
    }

}

/**
 * Your NumArray object will be instantiated and called as such:
 * var obj = NumArray(nums)
 * var param_1 = obj.sumRange(left,right)
 */