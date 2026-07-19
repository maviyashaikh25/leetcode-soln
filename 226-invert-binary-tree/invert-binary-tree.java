class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        
        TreeNode leftmir=invertTree(root.left);
        TreeNode rightmir=invertTree(root.right);

root.left = rightmir;
root.right = leftmir ;
        return root;
    }
}
