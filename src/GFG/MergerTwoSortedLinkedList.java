package GFG;

public class MergerTwoSortedLinkedList {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node head = new Node(5,a);
        Node b = new Node(3);
        Node head2 = new Node(2,b);
        Node ans = sortedMerge2(head,head2);
        Node.printLinkedList(ans);
    }
    static Node sortedMerge1(Node head1, Node head2) {
        Node ans = new Node(-1);
        Node temp = ans;
        while (head1!=null && head2!=null){
            if(head1.data > head2.data ){
                temp.next = head2;
                head2 = head2.next;
                temp= temp.next;
            }
            else if(head2.data> head1.data){
                temp.next = head1;
                head1 = head1.next;
                temp= temp.next;
            }
            else{
                temp.next = head1;
                temp= temp.next;
                temp.next = head2;
                head2 = head2.next;
                head1= head1.next;
            }
        }
        while (head1!=null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2!=null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return ans.next;
    }

    static Node sortedMerge2(Node head1, Node head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;

        Node dummy = new Node(-1);
        Node curr = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                curr.next = head1;
                head1 = head1.next;
            } else {
                curr.next = head2;
                head2 = head2.next;
            }
            curr = curr.next;
        }

        curr.next = (head1 != null) ? head1 : head2;

        return dummy.next;
    }
}
