package binarySeachTree;


// implementation of binary search tree
public class BinarySearchTree {

    public Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insertNode(int i) {

        Node addNode = new Node(i);

        // check if the root is null
        if (root == null) {
            // add node to root
            root = addNode;
            return;
        } else {

            // if root exists try to compare with root and traverse

            Node curr = root;

            while (curr != null) {

                // if the current element already exists in the bst please return
                if (curr.data == i) {
                    System.out.println("Element already exists in the BST");
                    return;
                }
                if (curr.data > i) {
                    // check if its left node is free
                    if (curr.left == null) {
                        // add node to left
                        curr.left = addNode;
                        return;
                    } else {
                        curr = curr.left;
                    }
                } else {

                    // check if its right node is free
                    if (curr.right == null) {
                        // add node to right
                        curr.right = addNode;
                        return;
                    } else {
                        curr = curr.right;
                    }
                }
            }
        }

    }

    public void inorderTraversal(Node root) {
        if (root == null) return;

        inorderTraversal(root.left);
        System.out.println(root.data + " ");
        inorderTraversal(root.right);

    }

    public void deleteNode(int i) {

        // there are three cases that are to be considered

        // 1. when there are no children, then simply delete that node

        // 2. when there is only one child

        // 3. when both children are available, need successor node to replace the deleting node
    }

    public int maxHeight(Node root) {
        if (root == null) {
            return -1;
            // check if leaf node to return 0
        } else if (root.left == null && root.right == null) {
            return 0;
        }

        int lheight = maxHeight(root.left);
        int rheight = maxHeight(root.right);

        return Math.max(lheight, rheight) + 1;

    }

    public void printAllLeafNodes(Node root) {
        // if root node or no leaf print it
        if (root == null) {
            return;
        }

        printAllLeafNodes(root.left);
        // check if that node has on children
        if (root.left == null && root.right == null)
        System.out.println(root.data);
        printAllLeafNodes(root.right);
    }

    // test case 1
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insertNode(10);
        bst.insertNode(8);
        bst.insertNode(3);
        bst.insertNode(5);
        bst.insertNode(15);

        bst.inorderTraversal(bst.root);
        System.out.println('\n');
        bst.printAllLeafNodes(bst.root);
        System.out.println(bst.maxHeight(bst.root));
    }
}
