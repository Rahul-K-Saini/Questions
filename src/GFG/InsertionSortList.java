package GFG;

public class InsertionSortList {
    public static void main(String[] args) {
        Node head = new Node(-1);
        Node a = new Node(5);
        Node b = new Node(2);
        Node c = new Node(0);
        head.next = a;
        a.next = b;
        b.next = c;
        c.next = null;
        Node ans = insertionSort(head);
        while(ans!=null){
            System.out.println(ans.data);
            ans = ans.next;
        }

    }
    public static Node insertionSort(Node head)
    {
        Node dummy = new Node(1000);
        Node curr = head;

        while (curr != null) {
            Node prev = dummy;

            while (prev.next != null && prev.next.data <= curr.data) {
                prev = prev.next;
            }

            Node next = curr.next;
            curr.next = prev.next;
            prev.next = curr;

            curr = next;
        }

        return dummy.next;
    }

}
