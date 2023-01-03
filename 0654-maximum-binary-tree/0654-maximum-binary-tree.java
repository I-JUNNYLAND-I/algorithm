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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int len = nums.length;
        int index = findMaxIndex(nums);
        TreeNode root = new TreeNode(nums[index]);
        treeBuilder(root, nums);
        return root;
    }
    
    private void treeBuilder(TreeNode node, int[] arr) {
        if (node == null) return;
        int len = arr.length;
        int index = findMaxIndex(arr);
        int[] left = Arrays.copyOfRange(arr, 0, index);
        int[] right = Arrays.copyOfRange(arr, index + 1, len);
        TreeNode lNode = left.length == 0 ? null : new TreeNode(left[findMaxIndex(left)]);
        TreeNode rNode = right.length == 0 ? null : new TreeNode(right[findMaxIndex(right)]);
        node.left = lNode;
        node.right = rNode;
        treeBuilder(node.left, left);
        treeBuilder(node.right, right);
    }
    
    private int findMaxIndex(int[] nums) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                index = i;
            }
        }
        return index;
    }
}