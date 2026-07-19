
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
  List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
boolean lefttoright = true ; 
        while (!q.isEmpty()) {
            int size = q.size();
            Deque<Integer> level = new ArrayDeque<>();

            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                if(lefttoright){
                level.addLast(curr.val);
                }else{
                     level.addFirst(curr.val);

                }
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }

            result.add( new ArrayList<>(level));
            lefttoright = !lefttoright ;
        }

        return result;

    }
}