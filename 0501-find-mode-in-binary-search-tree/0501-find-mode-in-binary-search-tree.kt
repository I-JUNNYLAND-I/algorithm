class Solution {
    fun findMode(root: TreeNode?): IntArray {

        val frequencyMap = mutableMapOf<Int, Int>()  // value, count

        fun helper(node: TreeNode?) {
            if (node == null) return

            helper(node.left)
            frequencyMap[node.`val`] = (frequencyMap[node.`val`] ?: 0) + 1
            helper(node.right)
        }

        helper(root)
        
        val frequencyList = frequencyMap.toList()
        val max = frequencyList.maxBy { it.second }?.second ?: 0

        return frequencyList
            .filter { it.second == max }
            .map { it.first }
            .toIntArray()
    }
}