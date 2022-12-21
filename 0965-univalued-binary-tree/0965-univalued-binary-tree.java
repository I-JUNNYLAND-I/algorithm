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
    int[] screen = new int[101];
    public boolean isUnivalTree(TreeNode root) {
        helper(root);
        int count = 0;
        for (int num : screen) {
            if (num != 0) count++;
        }
        return count == 1;
    }
    
    public void helper(TreeNode node) {
        if (node == null) return;
        screen[node.val]++;
        helper(node.left);
        helper(node.right);
    }
}