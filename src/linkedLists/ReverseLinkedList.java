package linkedLists;

public class ReverseLinkedList {

    public static Node reverseListRecursion(Node head) {

        // base condition is to check if last node (which will be the head)
        if (head.next == null) {
            return head;
        }

        // to traverse till end of the list and identify head
        Node rev = reverseListRecursion(head.next);
        // change links in each stack call
        head.next.next = head;
        // chain head till the end of main calling method
        head.next = null;
        return rev;
    }

    public static Node reverseTwoSubList(Node head) {

        // check if there are atleast two nodes
        if (head == null || head.next == null) return head;

        Node dummy = new Node(-1);
        dummy.next = head;
        Node prev = dummy;

        while(head != null && head.next != null) {
            Node firstNode = head;
            Node secondNode = head.next;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;
            prev.next = secondNode;
            head = firstNode.next;
            prev = firstNode;
        }

        return dummy.next;
    }

    // 1 -> 2 -> 3 -> 4
    // dummy -> 2 -> 1 -> 3 -> 4

    public static void main(String[] args) {
        Node headex = new Node(1);
        headex.next = new Node(2);
        headex.next.next = new Node(3);
        headex.next.next.next = new Node(4);

//        Node newhead = reverseListRecursion(headex);
        Node newhead = reverseTwoSubList(headex);

        while(newhead!=null) {
            System.out.println(newhead.val);
            newhead = newhead.next;
        }
    }
}
