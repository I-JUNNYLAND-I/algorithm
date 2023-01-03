class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {

        var check:Int = n

        for (index in flowerbed.indices) {
            if(n<= 0) break
            if (flowerbed[index] == 1) continue

            if ((index == 0 || flowerbed[index - 1] == 0) && (index == flowerbed.size - 1 || flowerbed[index + 1] == 0)) {
                check--
                flowerbed[index] = 1
            }
        }

        return check <=0
    }
}