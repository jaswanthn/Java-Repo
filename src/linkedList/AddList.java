package linkedList;

public class AddList {

    public static Node addListRecursively(Node N1, Node N2, int carry) {

        // base case
        if (N1 == null && N2 == null) {
            if (carry > 0) {
                return new Node(carry);
            }

            return null;
        }

         int N1val =  (N1 == null)? 0 : N1.val;
         int N2val =  (N2 == null)? 0: N2.val;

        int sum = (N1val + N2val + carry) % 10;
         carry = (N1val + N2val + carry) / 10;

         Node head = new Node(sum);

         head.next = addListRecursively(N1.next, N2.next, carry);

         return head;

    }
}
