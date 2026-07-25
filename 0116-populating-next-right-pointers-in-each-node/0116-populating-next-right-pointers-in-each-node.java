class Solution {
    public Node connect(Node root) {
        if (root == null) return null;
        connectNodes(root.left, root.right);
        return root;
    }

    private void connectNodes(Node left, Node right) {
        if (left == null || right == null) return;

        left.next = right;

        connectNodes(left.left, left.right);
        connectNodes(right.left, right.right);
        connectNodes(left.right, right.left);
    }
}
