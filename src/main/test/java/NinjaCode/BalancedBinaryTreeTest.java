package NinjaCode;

import NinjaCode.BST.BalancedBinaryTree;
import NinjaCode.BST.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class BalancedBinaryTreeTest {
    @Test
    public void one() {
        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();
        TreeNode tree = new TreeNode(3, new TreeNode(9,null, null), new TreeNode(20,new TreeNode(15, null, null), new TreeNode(7, null, null)));
        Assert.assertTrue(balancedBinaryTree.isBalanced(tree));
    }

    @Test
    public void two() {
        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();
        TreeNode tree = new TreeNode(1, new TreeNode(2,new TreeNode(3,new TreeNode(4,null, null), new TreeNode(4,null, null)), new TreeNode(3,null, null)), new TreeNode(2,null, null));
        Assert.assertFalse(balancedBinaryTree.isBalanced(tree));
    }
}
