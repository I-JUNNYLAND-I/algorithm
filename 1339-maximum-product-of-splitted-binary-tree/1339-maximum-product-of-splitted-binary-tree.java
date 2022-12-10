class Solution {
    long max = 0; 
    public int maxProduct(TreeNode root) {
        long MOD = 1_000_000_007L;
        long sum = getSum(root);
        maxSum(root, sum);
        return (int)(max % MOD);
    }
    
    private long maxSum(TreeNode root, long sum){
        if(root == null) return 0;
        long left = maxSum(root.left, sum);
        long right = maxSum(root.right, sum);
        long curr = left + right + root.val;
        max = Math.max(max, curr * (sum - curr));
        return curr;
    }
    
    private long getSum(TreeNode root){
        if(root == null) return 0;
        long left = getSum(root.left);
        long right = getSum(root.right);
        return left + right + root.val;
    }
}





