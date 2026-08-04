class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
         List<List<Integer>> ans = new ArrayList<>();
         List<Integer> curr = new ArrayList<>();
        dfs(root , targetSum , curr , ans);
        return ans;
    }
    private void dfs(TreeNode root , int targetSum , List<Integer> curr , List<List<Integer>> ans){
        if(root == null){
            return;
        }
        curr.add(root.val);
        if(root.left == null && root.right == null){
            if(targetSum == root.val){
            ans.add(new ArrayList<>(curr));
            }
             curr.remove(curr.size() - 1);
             return;
        }
        dfs(root.left , targetSum-root.val ,curr , ans);
        dfs(root.right ,targetSum-root.val , curr, ans);
        // backtrack
        curr.remove(curr.size() - 1);
    }
}