/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<TreeNode> list = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        inOrder(root);
        return createBalancedTree(0, list.size() - 1);
    }
    
    private void inOrder(TreeNode node) {
        if (node == null) return;
        inOrder(node.left);
        list.add(node);
        inOrder(node.right);
    }
    
    private TreeNode createBalancedTree(int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        TreeNode node = list.get(mid);
        node.left = createBalancedTree(start, mid - 1);
        node.right = createBalancedTree(mid + 1, end);
        return node;
    }
    
}