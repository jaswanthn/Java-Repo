package myAlgos;

public class NodeTest {

    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public Node initiateNode() {
        Node x = new Node(6);
        x.next = new Node(7);
        x.next.next = new Node(8);
        x.next.next.next = new Node(9);
        return x;
    }

    public static void main(String[] args) {
        NodeTest n1 = new NodeTest();
       Node head =  n1.initiateNode();

       Node rev = n1.reverseListIteration(head);

       while(rev!=null) {
           System.out.println(rev.val);
           rev = rev.next;
       }
    }

    public Node reverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node rev = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return rev;
    }

    public Node reverseListIteration(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node curr = head.next;
        Node prev = head;
        head.next = null;

        while(curr!=null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;

    }
}
