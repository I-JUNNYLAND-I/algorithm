/**
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var children: List<Node?> = listOf()
 * }
 */

class Solution {
fun maxDepth(root: Node?): Int {
    if (root == null) return 0
    var max = 0
    for (child in root.children) {
        max = Math.max(max, maxDepth(child))
    }
    return max + 1
}
}