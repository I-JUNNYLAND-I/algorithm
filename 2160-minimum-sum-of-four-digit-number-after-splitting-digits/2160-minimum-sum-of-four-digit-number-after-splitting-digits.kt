class Solution {
    fun minimumSum(num: Int): Int {
        
    var s = num.toString().toCharArray()
    s.sort()
    var new1 = ""
    var new2 = ""
    new1 = (s[0].toString() + s[2].toString())
    new2 = (s[1].toString() + s[3].toString())
    return (new1.toInt() + new2.toInt())

    }
}