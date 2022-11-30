class Solution {
    fun prefixCount(words: Array<String>, pref: String): Int {
               var sum =0
    for(i in words.indices){
        if(words[i].startsWith(pref)){
            sum++
        }
    }
    return sum
    }
}