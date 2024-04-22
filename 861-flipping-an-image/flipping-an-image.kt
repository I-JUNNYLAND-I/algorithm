	class Solution {
		fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray> {
			val n = image.size
			for (i in 0 until n) {
				var left = 0
				var right = n - 1
				while (left < right) {
					val temp = image[i][left]
					image[i][left] = image[i][right] xor 1
					image[i][right] = temp xor 1
					left++
					right--
				}
				if (left == right) {
					image[i][left] = image[i][left] xor 1
				}
			}
			return image
		}
	}