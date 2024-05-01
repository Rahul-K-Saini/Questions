package GFG;

import java.util.ArrayList;

public class ArrangeConsonantsAndVowelsLL {
    static class Node{
        char data;
        Node next;
        public Node(char data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node head = new Node('a');
        head.next = new Node('b');
        head.next.next = new Node('c');
        head.next.next.next = new Node('d');
        head.next.next.next.next = new Node('e');
        head.next.next.next.next.next = new Node('f');
        head.next.next.next.next.next.next = new Node('g');
        head.next.next.next.next.next.next.next = new Node('h');
        head.next.next.next.next.next.next.next.next = new Node('i');
        head.next.next.next.next.next.next.next.next.next = new Node('j');
        Node ans = arrangeCV(head);
        while(ans != null){
            System.out.println(ans.data);
            ans = ans.next;
        }
    }
    public static Node arrangeCV(Node head){
        ArrayList<Character> list = new ArrayList<>();
        while(head != null){
            list.add(head.data);
            head = head.next;
        }
        ArrayList<Character> list2 = new ArrayList<>();

        for (Character c : list){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                list2.add(c);
            }
        }

        for (Character c : list){
            if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'){
                list2.add(c);
            }
        }

        Node newNode = new Node('1');
        Node temp = newNode;
        for (Character c : list2){
            temp.next = new Node(c);
            temp = temp.next;
        }
        return newNode.next;


    }
}
