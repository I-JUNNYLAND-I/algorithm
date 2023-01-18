class Solution:GuessGame() {
    override fun guessNumber(n:Int):Int {
        var low = 1
        var high = n
        
        while (low != high) {
            val myGuess = (high - low + 1) / 2 + low
            when (guess(myGuess)) {
                -1 -> high = myGuess - 1
                1 -> low = myGuess + 1
                0 -> { high = myGuess; low = myGuess }
            }
        }
        
        return low
    }
}