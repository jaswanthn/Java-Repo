package myAlgos;

public class BalanceTree {

    public boolean isBalanced(TreeNode node) {

        // first check if the tree node is null
        if (node == null) return true;

        int leftHeight = heightOfTree(node.left);
        int rightHeight = heightOfTree(node.right);

        if (Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(node.left)
            && isBalanced(node.right)) {
            return true;
        }

        // if we reach this point that means tree is not balanced
        // hence return false
        return false;

    }

    // height of tree is max height from root to leaf
    private int heightOfTree(TreeNode node) {

        if (node == null) return 0;

        // height of a node is always the maximum or longest path to their leaf nodes
        int height = 1 + Math.max(heightOfTree(node.left), heightOfTree(node.right));

        return height;
    }
}
