class Solution {
    private int maxSum;

    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        dfs(root);
        return maxSum;
    }

    private int dfs(TreeNode node) {
        if (node == null) return 0;

       
        int leftGain = Math.max(dfs(node.left), 0);
        int rightGain = Math.max(dfs(node.right), 0);

       
        int currentPath = node.val + leftGain + rightGain;

       
        maxSum = Math.max(maxSum, currentPath);

       
        return node.val + Math.max(leftGain, rightGain);
    }
}
