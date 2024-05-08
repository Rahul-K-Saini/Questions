package LeetCode;

public class ListNode {
       int val;
       ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      static ListNode head = new ListNode(0);
      public static ListNode getList(int n){
            ListNode temp = head;
            for (int i = 1; i <=n; i++) {
                  temp.next = new ListNode(i);
                  temp = temp.next;
            }
            return head.next;
      }
      public static void print(ListNode node){
            ListNode temp = node;
            while(temp!=null){
                  System.out.println(temp.val);
                  temp = temp.next;
            }
      }
      public static ListNode reverse(ListNode head){
            ListNode prev = null;
            ListNode curr = head;
            ListNode agla = head.next;
            while(curr!=null){
                  curr.next = prev;
                  prev = curr;
                  curr = agla;
                  if(agla!=null){
                        agla = agla.next;
                  }
            }
            return prev;
      }



}
