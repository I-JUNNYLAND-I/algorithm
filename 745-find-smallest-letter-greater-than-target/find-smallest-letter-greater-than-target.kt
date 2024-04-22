class Solution {
    fun nextGreatestLetter(letters: CharArray, target: Char): Char {
        var index = 0;
        var min = 27;

        for (i in letters.indices){
            val minus = letters[i] - target
            if(minus > 0) {
                if(min > minus){
                    min = minus
                    index = i
                }
            }
        }
        return letters[index]
    }
}