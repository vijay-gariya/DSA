class Solution {
    public void flatten(TreeNode root) {
        //swapnil
        Queue<TreeNode> q = new LinkedList<>();
        insert(root, q);
        q.poll(); // skip the original root since we'll relink from it
        while (!q.isEmpty()) {
            root.right = q.poll(); // connect to next node
            root.left = null;      // left should be null in linked list
            root = root.right;
        }
    }

    // Preorder traversal to collect nodes
    void insert(TreeNode node, Queue<TreeNode> queue) {
        if (node == null) return;
        queue.add(node);
        insert(node.left, queue);
        insert(node.right, queue);
    }
}