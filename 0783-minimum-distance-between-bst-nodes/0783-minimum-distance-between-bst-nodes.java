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
    List<Integer> list = new ArrayList<>();
    public int minDiffInBST(TreeNode root) {
        dfs(root);
        Collections.sort(list);
        int size = list.size();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < size - 1; i++) {
            min = Math.min(min, list.get(i + 1) - list.get(i));
        }
        return min;
    }
    
    private void dfs(TreeNode node) {
        if (node == null) return;
        list.add(node.val);
        dfs(node.left);
        dfs(node.right);
    }
}