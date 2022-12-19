/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    int max = 0;
    public int maxDepth(Node root) {
        helper(root, 1);
        return max;
    }
    private int helper(Node node, int depth) {
        if (node == null) {
            return 0;
        }
        if (node.children != null) {
            max = Math.max(max, depth);
            for (Node n : node.children) {
                helper(n, depth + 1);
            }
        }
        return depth;
    }
}