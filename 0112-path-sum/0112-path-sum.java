
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
         if(root == null){
        return false;
       }
       if(root.left == null && root.right == null && root.val == targetSum){
        return true;
       }
       boolean lans = hasPathSum(root.left, targetSum-root.val);
       boolean rans = hasPathSum(root.right, targetSum-root.val);
       return lans || rans;
      
    }
}