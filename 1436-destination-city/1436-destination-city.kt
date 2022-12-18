class Solution {
fun destCity(paths: List<List<String>>): String {
    val map = paths.map { it[0] to it[1] }.toMap()
    var key = paths[0][0]
    while (map.containsKey(key)) {
        key = map[key]!!
    }
    return key
}
}