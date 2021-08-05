package NinjaCode.BST;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        int leftHeight;
        int rightHeight;
        if(root == null) return true;
        leftHeight = height(root.left);
        rightHeight = height(root.right);
        if (Math.abs(leftHeight - rightHeight) <= 1
                && isBalanced(root.left)
                && isBalanced(root.right))
            return true;
        return false;
    }

    int height(TreeNode node)
    {
        /* base case tree is empty */
        if (node == null)
            return 0;

        /* If tree is not empty then height = 1 + max of left
         height and right heights */
        return 1 + Math.max(height(node.left), height(node.right));
    }
}
