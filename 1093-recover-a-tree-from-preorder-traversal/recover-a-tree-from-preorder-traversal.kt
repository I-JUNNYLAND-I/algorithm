/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
	class Solution {
		fun recoverFromPreorder(traversal: String): TreeNode? {
			val stack = mutableListOf<TreeNode>()
			var i = 0
			while (i < traversal.length) {
				var level = 0
				while (traversal[i] == '-') {
					level++
					i++
				}
				var value = 0
				while (i < traversal.length && traversal[i] != '-') {
					value = value * 10 + (traversal[i] - '0')
					i++
				}
				val node = TreeNode(value)
				if (level == stack.size) {
					if (stack.isNotEmpty()) {
						stack.last().left = node
					}
				} else {
					while (level != stack.size) {
						stack.removeAt(stack.size - 1)
					}
					stack.last().right = node
				}
				stack.add(node)
			}
			return stack.first()
		}
	}