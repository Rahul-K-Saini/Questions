package LeetCode;

import java.util.ArrayList;
import java.util.Collections;

public class MergeSortedLinkedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(4);
        l2.next = new ListNode(5);
        l2.next.next = new ListNode(6);

        ListNode l3 = new ListNode(7);
        l3.next = new ListNode(8);
        l3.next.next = new ListNode(9);

        ListNode[] arr = {l1, l2, l3};
        ListNode Node  = mergeKLists2(arr);
        ListNode node = mergeKLists2(arr);
        while (node != null) {
            System.out.println(node.val+" ");
            node = node.next;
        }
    }
    // array Solution (not very efficient)
    static ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        ArrayList<Integer> list = new ArrayList<>();
        for (ListNode node : lists) {
            while (node != null) {
                list.add(node.val);
                node = node.next;
            }
        }
        if(list.isEmpty()) return null;
        Collections.sort(list);
        ListNode head = new ListNode(list.get(0));
        ListNode temp = head;
        for (int i = 1; i < list.size(); i++) {
            temp.next = new ListNode(list.get(i));
            temp = temp.next;
        }
        return head;
    }

    // merging solution (very efficient) // merge sort
    static ListNode mergeKLists2(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        return merge(lists, 0, lists.length-1);
    }

    private static ListNode merge(ListNode[] lists, int start, int end){

        if(start == end){
            return lists[start];
        }

        int mid = (start+end)/2;
        ListNode ls1 = merge(lists, start, mid);
        ListNode ls2 = merge(lists, mid+1,end);

        return mergeLists(ls1, ls2);
    }
    private static ListNode mergeLists(ListNode list1, ListNode list2){

        ListNode head = new ListNode();
        ListNode cur = head;
        while(list1!=null && list2!=null){

            if(list1.val<list2.val){
                cur.next = list1;
                list1 = list1.next;
            }
            else{
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }

        if(list1!=null){
            cur.next = list1;
        }
        else if(list2!=null){
            cur.next = list2;
        }

        return head.next;
    }
}
