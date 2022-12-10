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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaf1 = new ArrayList<>();
        List<Integer> leaf2 = new ArrayList<>();
        getLeafNodeValue(root1, leaf1);
        getLeafNodeValue(root2, leaf2);
        return leaf1.equals(leaf2);        
    }
    
    public void getLeafNodeValue(TreeNode node, List<Integer> list) {
        if (node.left == null && node.right == null) {
            list.add(node.val);
        }
        if(node.left != null) {
            getLeafNodeValue(node.left, list);    
        }
        if(node.right != null) {
            getLeafNodeValue(node.right, list);        
        }
    }
}