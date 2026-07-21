
class Solution {

      private int preIdx = 0;
    private Map<Integer, Integer> pos = new HashMap<>();
    private int[] preorder;


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        for (int i = 0; i < inorder.length; i++) {
            pos.put(inorder[i], i);
        }
        return build(0, inorder.length - 1);
        
        
    }


     private TreeNode build(int l, int r) {
        if (l > r) return null;
        int rootVal = preorder[preIdx++];
        TreeNode root = new TreeNode(rootVal);
        int mid = pos.get(rootVal);
        root.left = build(l, mid - 1);
        root.right = build(mid + 1, r);
        return root;
    }
}