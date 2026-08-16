class Solution {
    public int maxLevelSum(TreeNode root) {
        if(root == null){
            return -1;
        }
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
       int ans = 0;
       int maxSum = Integer.MIN_VALUE;
        int level = 1;
        while(!q.isEmpty()){
            int size = q.size();
            int sum = 0;
            for(int i = 0; i<size; i++){
                TreeNode node = q.poll();
                sum = sum + node.val;
                if(node.left != null){
                    q.offer(node.left);
                }
                if(node.right != null){
                    q.offer(node.right);
                }
            }
           if(maxSum < sum){
            maxSum = sum;
            ans = level;
           }
           level++;
        }
        return ans;
    }
}