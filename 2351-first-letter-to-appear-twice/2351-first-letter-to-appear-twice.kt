class Solution {
fun repeatedCharacter(s: String): Char {
    val map = mutableMapOf<Char, Int>()
    s.forEach {
        if (map.containsKey(it)) {
            map[it] = map[it]!! + 1
        } else {
            map[it] = 1
        }
        if(map[it] == 2){
            return it
        }
    }
    return ' '
}
}