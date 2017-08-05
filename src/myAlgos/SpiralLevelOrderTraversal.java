package myAlgos;

import java.util.Stack;

public class SpiralLevelOrderTraversal {

    public TreeNode root;

    private class TreeNode {

        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public void createTree() {
        this.root = new TreeNode(0);
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(8);
        TreeNode n9 = new TreeNode(9);

        root.left  = n1;
        root.right = n2;

        n1.left  =  n4;
        n1.right = n5;

        n2.left  = n3;
        n2.right = n6;

        n5.left  = n7;
        n5.right = n8;

        n6.left  = n9;

    }

    public void printSpiral(TreeNode root) {

        if (root == null) {
            return;
        }
        // store values in left to right
        Stack<TreeNode> stackEven = new Stack<TreeNode>();

        // store values in right to left format
        Stack<TreeNode> stackOdd = new Stack<TreeNode>();

        stackEven.push(root);
        boolean evenLevel = true;

        // write main condition to enter into while loop
        while((evenLevel && !stackEven.isEmpty()) || (!stackOdd.isEmpty())) {
            if (evenLevel) {
                while(!stackEven.isEmpty()) {
                    TreeNode current = stackEven.pop();
                    System.out.println(" " + current.val);
                    // prepare next level to save
                    if (current.right != null) {
                        stackOdd.push(current.right);
                    }

                    if (current.left != null) {
                        stackOdd.push(current.left);
                    }
                }
            } else {
                     while(!stackOdd.isEmpty()) {
                         TreeNode current = stackOdd.pop();
                         System.out.println(" " + current.val);
                         // prepare next level i.e even stack
                         if (current.left != null) {
                             stackEven.push(current.left);
                         }

                         if (current.right != null) {
                             stackEven.push(current.right);
                         }

                     }
            }

            evenLevel = !evenLevel;

        }
    }

    public static void main(String[] args) {
        SpiralLevelOrderTraversal spl = new SpiralLevelOrderTraversal();
        spl.createTree();
        spl.printSpiral(spl.root);
    }
}
