
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0 ;
        }

        int lf = maxDepth(root.left);
        int rh = maxDepth(root.right);

        return 1 + Math.max(lf,rh);
        
    }
 
}