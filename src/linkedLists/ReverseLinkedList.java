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


    public static void main(String[] args) {
        Node headex = new Node(1);
        headex.next = new Node(2);
        headex.next.next = new Node(3);
        headex.next.next.next = new Node(4);

        Node newhead = reverseListRecursion(headex);

        while(newhead!=null) {
            System.out.println(newhead.val);
            newhead = newhead.next;
        }
    }
}
