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
    public boolean findTarget(TreeNode root, int k) {
        bfs(root);
        for (int i = 0; i < list.size(); i++) {
            int target = k - list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) == target) return true;
            }
        }
        return false;
    }
    
    private void bfs(TreeNode node) {
        Queue<TreeNode> q = new LinkedList();
        q.offer(node);
        while(!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = q.poll();
                list.add(cur.val);
                if (cur.left != null) q.offer(cur.left);
                if (cur.right != null) q.offer(cur.right);
            }
        }
    }
    
}