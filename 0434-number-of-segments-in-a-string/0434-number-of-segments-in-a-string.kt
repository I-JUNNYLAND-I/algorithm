class Solution {
fun countSegments(s: String): Int {
    var count = 0
    s.split(" ").forEach{ if(it != "") count++ }
    return count
}

}