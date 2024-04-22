class Solution {
    fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray> {
        for (i in image.indices) {
            image[i] = image[i].reversedArray()
            for (j in image[i].indices) {
                image[i][j] = image[i][j] xor 1
            }
        }

        return image
    }
}