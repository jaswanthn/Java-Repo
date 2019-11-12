package linkedList;

public class DeleteNodeFromList {


    public static void main(String[] args) {
        Node x  = new Node(3);
        x.next = new Node(4);
        x.next.next = new Node(5);
        x.next.next.next = new Node(6);

        Node head = deleteNode(x, 10);
        while (head!=null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static Node deleteNode(Node head, int val) {

        if (head.val == val && head.next == null) {
            System.out.println("Head is the only element ... Hence removing head" +
                    "as the value matched");
            head = null;
        }

        if (head.val == val && head.next != null) {
            // make head as next element
            head = head.next;
        }

        else {
            Node prev = head;
            Node curr = head.next;
            while(curr!=null) {
                if (curr.val == val) {
                    prev.next = curr.next;
                    return head;
                }
                prev = curr;
                curr = curr.next;
            }
        }

        return head;
    }
}


