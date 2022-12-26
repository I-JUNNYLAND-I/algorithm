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
    
    
    public int findSecondMinimumValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> values = new ArrayList<>();
        
        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            values.add(cur.val);
            if (cur.left != null) queue.offer(cur.left);
            if (cur.right != null) queue.offer(cur.right);
        }
        
        int max = root.val;
        
        Collections.sort(values);
        for (int num : values) {
            if (max < num) return num;
        }
        
        return -1;
    }
    
}