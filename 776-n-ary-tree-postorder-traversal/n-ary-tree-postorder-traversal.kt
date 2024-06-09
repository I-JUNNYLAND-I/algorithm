class Solution {
    fun postorder(root: Node?): List<Int> = when (root) {
        null -> emptyList()
        else -> root.children.flatMap { postorder(it) } + root.`val`
    }
}