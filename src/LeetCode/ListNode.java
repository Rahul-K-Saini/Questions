package LeetCode;

public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      static ListNode head = new ListNode(0);
      static ListNode getList(){
            ListNode temp = head;
            for (int i = 1; i <=10 ; i++) {
                  temp.next = new ListNode(i);
                  temp = temp.next;
            }
            return head;
      }
      static void print(ListNode node){
            ListNode temp = node;
            while(temp!=null){
                  System.out.println(temp.val);
                  temp = temp.next;
            }
      }
}
