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
    int[] arr = new int[200001];
    int maxFreq = 0;
    public int[] findMode(TreeNode root) {
        helper(root);
        int max = 0;
        int index = 0;
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == maxFreq) {
                temp.add(i);
            }
        }
        int[] answer = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i) - 100000;
        }
        return answer;
    }
    
    private void helper(TreeNode node) {
        if (node == null) return;
        arr[node.val + 100000]++;
        maxFreq = Math.max(maxFreq, arr[node.val + 100000]);
        helper(node.left);
        helper(node.right);
    }
}