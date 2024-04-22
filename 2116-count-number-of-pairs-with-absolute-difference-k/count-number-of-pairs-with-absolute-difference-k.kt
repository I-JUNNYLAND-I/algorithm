	class Solution {
		fun countKDifference(nums: IntArray, k: Int): Int {
			var count = 0
			for (i in nums.indices) {
				for (j in i + 1 until nums.size) {
					if (nums[i] - nums[j] == k || nums[j] - nums[i] == k) {
						count++
					}
				}
			}
			return count
		}
	}