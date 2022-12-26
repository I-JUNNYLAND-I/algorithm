/**
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var children: List<Node?> = listOf()
 * }
 */

class Solution {
val orderList = mutableListOf<Int>()
fun postorder(root: Node?): List<Int> {
    root ?: return orderList
    for (child in root.children) postorder(child)
    orderList.add(root.`val`)
    return orderList
}
}