package GFG;
public class AlternateReverseLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node a = new Node(4);
        Node b = new Node(9);
        Node c = new Node(1);
        Node d = new Node(3);
        Node e = new Node(5);
        Node f = new Node(9);
        Node g = new Node(4);
        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        rearrange(head);
        Node yo = head;
        while (yo!=null){
            System.out.println(yo.data);
            yo = yo.next;
        }
    }
    public static Node rearrange(Node head)
    {
        if (head == null || head.next == null) {
            return head;
        }

        Node evenHead = head.next;
        Node odd = head;
        Node even = evenHead;

        while (true) {
            if (odd == null || even == null || even.next == null) {
                odd.next = evenHead;
                break;
            }

            odd.next = even.next;
            odd = even.next;

            if (odd.next == null) {
                even.next = null;
                odd.next = evenHead;
                break;
            }

            even.next = odd.next;
            even = odd.next;
        }

        // Reverse the even-indexed list
        evenHead = reverse(evenHead);

        // Append the reversed list to the end of the original list
        if (odd != null) {
            odd.next = evenHead;
        }

        return head;
    }

    private static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

}
