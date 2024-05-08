package LeetCode;

public class MergeInBetweenLinkedLists {
    public static void main(String[] args) {
        ListNode head = ListNode.getList(10);
        ListNode node = new ListNode(11);
        node.next = new ListNode(12);
        node.next.next = new ListNode(13);
        ListNode.print(mergeInBetween(head,3,7,node));
    }
    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode aList = list1;
        while(a!=1){
                aList = aList.next;
                a--;
        }
        ListNode bList = list1;
        while(b!=0){
            bList = bList.next;
            b--;
        }
       ListNode temp = list2;
        aList.next = list2;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = bList;
        return list1;
    }
}
