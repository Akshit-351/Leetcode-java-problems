class Solution {

    static class Pair {
        TreeNode node;
        long index;

        Pair(TreeNode node, long index) {
            this.node = node;
            this.index = index;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {

        if (root == null) {
            return 0;
        }

        Queue<Pair> q = new ArrayDeque<>();
        q.offer(new Pair(root, 0));

        long maxWidth = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            // Index of the first node in this level
            long firstIndex = q.peek().index;

            long lastIndex = firstIndex;

            for (int i = 0; i < size; i++) {

                Pair current = q.poll();

                TreeNode node = current.node;
                long index = current.index;

                lastIndex = index;

                // Normalize index to avoid very large numbers
                long normalizedIndex = index - firstIndex;

                if (node.left != null) {
                    q.offer(new Pair(
                        node.left,
                        2 * normalizedIndex + 1
                    ));
                }

                if (node.right != null) {
                    q.offer(new Pair(
                        node.right,
                        2 * normalizedIndex + 2
                    ));
                }
            }

            long width = lastIndex - firstIndex + 1;

            maxWidth = Math.max(maxWidth, width);
        }

        return (int) maxWidth;
    }
}