package LeetCode;

public class InsertionSortList {
    public static void main(String[] args) {
        ListNode head = new ListNode(-1);
        ListNode a = new ListNode(5);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(0);
        head.next = a;
        a.next = b;
        b.next = c;
        c.next = null;
        ListNode ans = insertionSort(head);
        while(ans!=null){
            System.out.println(ans.val);
            ans = ans.next;
        }

    }
    public static ListNode insertionSort(ListNode head)
    {
        ListNode dummy = new ListNode(1000);
        ListNode curr = head;

        while (curr != null) {
            ListNode prev = dummy;

            while (prev.next != null && prev.next.val <= curr.val) {
                prev = prev.next;
            }

            ListNode next = curr.next;
            curr.next = prev.next;
            prev.next = curr;

            curr = next;
        }

        return dummy.next;
    }

}