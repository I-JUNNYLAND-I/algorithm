	class Solution {
		fun differenceOfSum(nums: IntArray): Int {
			val elementsSum = nums.flatMap { it.convertUnderTen() }.sum()
			val digitsSum = nums.sum()
			return digitsSum - elementsSum
		}
		private fun  Int.convertUnderTen(): List<Int> {
			return if ( this < 10)
				listOf(this)
			else
				this.toString().map { it.toString().toInt() }
		}
	}