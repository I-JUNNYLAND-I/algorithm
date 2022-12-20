class Solution {

    int max = 0;

    public int maxDepth(Node root) {

        int answer = 0;
        searchDepth(root, answer);
        System.out.println("max = " + max);
        return max;
    }

    private void searchDepth(Node root, int answer) {
        if (root != null) {
            answer += 1;
            if (root.children != null) {
                int finalAnswer = answer;
                root.children.forEach(root1 -> searchDepth(root1, finalAnswer));
            }
            max = Math.max(max, answer);
        }
    }
}