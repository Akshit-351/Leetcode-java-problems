class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root , targetSum);
    }
    public boolean dfs(TreeNode root , int targetSum){
        if(root == null){
            return false;
        }
        // no leaf
        if(root.left == null && root.right == null){
            if(targetSum == root.val){
                return true;
            }
        }
      //  int currSum = targetSum - root.val;
       //return dfs(root.left , currSum) || dfs(root.right , currSum);
       return dfs(root.left , targetSum-root.val) || dfs(root.right , targetSum-root.val);
    }
}