	class Solution {
		fun arithmeticTriplets(nums: IntArray, diff: Int): Int {
			val set = mutableSetOf<Int>()
			return nums.count { elem ->
				(set.contains(elem - diff) && set.contains(elem - 2 * diff)).also {
					set.add(elem)
				}
			}
		}
	}