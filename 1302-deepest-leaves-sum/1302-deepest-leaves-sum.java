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
    
    int max = 0;
    int sum = 0;
    public int deepestLeavesSum(TreeNode root) {
        findDepth(root, 0);
        dfs(root, 0);
        return sum;
    }
    
    private void findDepth(TreeNode node, int depth) {
        if (node == null) return;
        int temp = depth + 1;
        max = Math.max(max, temp);
        findDepth(node.left, temp);
        findDepth(node.right, temp);
    }
    
    private void dfs(TreeNode node, int depth) {
        if (node == null) return;
        int temp = depth + 1;
        if (temp == max) {
            sum += node.val;
        }
        dfs(node.left, temp);
        dfs(node.right, temp);
    }
    
    // max_depth 를 구한다
    // max_depth 랑 depth 가 같은 노드 값만 찾는다.
}