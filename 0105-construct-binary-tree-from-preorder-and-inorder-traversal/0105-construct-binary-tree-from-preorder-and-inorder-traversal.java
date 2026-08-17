class Solution {

    int preIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        Map<Integer, Integer> map = new HashMap<>();

        // Store inorder value -> index
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return build(preorder, 0, inorder.length - 1, map);
    }

    private TreeNode build(int[] preorder, int inStart, int inEnd,
                           Map<Integer, Integer> map) {

        // No elements in this subtree
        if (inStart > inEnd) {
            return null;
        }

        // First available preorder element is the root
        int rootValue = preorder[preIndex++];

        TreeNode root = new TreeNode(rootValue);

        // Find root in inorder
        int rootIndex = map.get(rootValue);

        // Build left subtree
        root.left = build(preorder, inStart, rootIndex - 1, map);

        // Build right subtree
        root.right = build(preorder, rootIndex + 1, inEnd, map);

        return root;
    }
}