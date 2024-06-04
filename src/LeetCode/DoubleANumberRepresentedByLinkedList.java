package LeetCode;

import java.util.ArrayList;

public class DoubleANumberRepresentedByLinkedList {
    public static void main(String[] args) {
        ListNode node = ListNode.getList(6);
        ListNode ans = doubleIt(node);
        ListNode.print(ans);
    }
    static ListNode doubleIt(ListNode head) {

        ListNode reversedList = reverseList(head);

        int carry = 0;
        ListNode current = reversedList, previous = null;


        while (current != null) {

            int newValue = current.val * 2 + carry;

            current.val = newValue % 10;

            if (newValue > 9) {
                carry = 1;
            } else {
                carry = 0;
            }

            previous = current;
            current = current.next;
        }


        if (carry != 0) {
            ListNode extraNode = new ListNode(carry);
            previous.next = extraNode;
        }


        ListNode result = reverseList(reversedList);

        return result;
    }


    static ListNode reverseList(ListNode node) {
        ListNode previous = null, current = node, nextNode;


        while (current != null) {

            nextNode = current.next;

            current.next = previous;

            previous = current;
            current = nextNode;
        }
     
        return previous;
    }

}
