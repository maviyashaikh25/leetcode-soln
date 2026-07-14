class Solution {
    int diameter = 0;

    public int dfs(TreeNode root) {
        if (root == null) return 0;

        int leftHeight = dfs(root.left);
        int rightHeight = dfs(root.right);

        diameter = Math.max(diameter, leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return diameter;
    }
}
