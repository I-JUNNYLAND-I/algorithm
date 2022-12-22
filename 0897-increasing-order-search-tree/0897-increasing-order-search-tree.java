import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        searchNode(root, list);

        Collections.sort(list);
        TreeNode treeNode = new TreeNode(list.get(0));
        list.remove(0);
        createTreeNode(treeNode, list);

        return treeNode;
    }

    private void createTreeNode(TreeNode treeNode, List<Integer> list) {
        if (list.size() > 0) {
            treeNode.right = new TreeNode(list.get(0));
            list.remove(0);
            createTreeNode(treeNode.right, list);
        }
    }

    private void searchNode(TreeNode node, List<Integer> list) {
        list.add(node.val);
        if (node.left != null) {
            searchNode(node.left, list);
        }
        if (node.right != null) {
            searchNode(node.right, list);
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}