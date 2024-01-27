package GFG;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        int[] values = {5, 1, 1, 5, 4, 3, 2, 3, 3, 3, 3, 3, 2, 2, 1, 2, 2, 1, 5, 5, 5, 1, 5, 2, 3, 3, 2, 2, 1, 5, 3, 3, 2, 3, 4, 2, 1, 2, 4, 5, 5, 4, 2, 3, 5};

        Node head = new Node(values[0]);
        Node current = head;

        for (int i = 1; i < values.length; i++) {
            Node newNode = new Node(values[i]);
            current.next = newNode;
            current = newNode;
        }

        System.out.println(isPalindrome(head));

    }
    static Node reverse(Node head){
        Node prev = null;
        Node n = null;
        Node curr = head;
        while(curr!=null){
            n = curr.next;
            curr.next = prev;
            prev = curr;
            curr = n;
        }
        return prev;
    }

    static boolean isPalindrome(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node temp = reverse(slow.next);
        slow.next = temp;
        Node p1 = head;
        Node p2 = slow.next;
        while(p2!=null){
            if(p1.data!=p2.data)return false;
            p1 = p1.next;
            p2 = p2.next;

        }
        return true;
    }

}
