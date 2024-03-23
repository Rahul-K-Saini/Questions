
package GFG;
public class LinkedListThatIsSortedAlternatingly {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node a = new Node(9);
        Node b = new Node(2);
        Node c = new Node(8);
        Node d = new Node(3);
        Node e = new Node(7);

        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node list1 = new Node(-1);
        Node list2 = new Node(-1);
        Node p1 = list1;
        Node p2 = list2;

        Node temp = head;
        boolean isList1 = true;
        while (temp != null) {
            if (isList1) {
                p1.next = temp;
                p1 = p1.next;
            } else {
                p2.next = temp;
                p2 = p2.next;
            }
            temp = temp.next;
            isList1 = !isList1;
        }
        p1.next = null;
        p2.next = null;
        Node reversed = reverse(list2.next);
        Node ans = mergeTwoLists(list1.next,reversed);
        Node.printLinkedList(ans);

    }
    static Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    static Node mergeTwoLists(Node list1, Node list2){
        if(list1!=null && list2!=null){
            if(list1.data<list2.data){
                list1.next=mergeTwoLists(list1.next,list2);
                return list1;
            }
            else{
                list2.next=mergeTwoLists(list1,list2.next);
                return list2;
            }
        }
        if(list1==null)
            return list2;
        return list1;
    }



}
