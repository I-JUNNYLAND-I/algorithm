class Solution {
fun finalValueAfterOperations(operations: Array<String>): Int {
    var num = 0
    operations.forEach {
        if (it.contains("++")){
            num++
        }
        else if (it.contains("--")){
            num--
        }
    }
    return num
}

}
