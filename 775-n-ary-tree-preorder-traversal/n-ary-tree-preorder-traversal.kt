/**
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var children: List<Node?> = listOf()
 * }
 */

class Solution {
    fun preorder(root: Node?): List<Int> {
        if (root == null) return emptyList()
        val result = mutableListOf<Int>()
        result.add(root.`val`)
        for (child in root.children) {
            result.addAll(preorder(child))
        }
        return result
    }
}