package GFG;

public class DeleteEveryKthNode {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        Node temp = delete(head,2);
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    static Node delete(Node head, int k)
    {
        int n =0;
        Node tem = head;
        while(tem != null){
            n++;
            tem = tem.next;
        }
        if(k>n) return head;
        if(k==1 || head == null){
            return null;
        }
        Node prev = null;
        Node curr = head;
        int count = 0;
        while(curr!=null){
           count++;
           if(count%k == 0){
               prev.next = curr.next;
               curr = curr.next;
           }
            else {
                prev = curr;
                curr = curr.next;
            }
        }
        return head;

    }
}
