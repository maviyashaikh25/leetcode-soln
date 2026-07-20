
class Solution {
    public boolean isValidBST(TreeNode root) {

 return validatehelper(root , Long.MIN_VALUE , Long.MAX_VALUE);
   
    }


    private boolean validatehelper(TreeNode node , long min , long max){


        if( node == null) return true ; 

        if(node.val <= min || node.val >= max){
            return false ;
        }

        return validatehelper(node.left , min , node.val) &&  validatehelper(node.right , node.val , max) ;

    }



}