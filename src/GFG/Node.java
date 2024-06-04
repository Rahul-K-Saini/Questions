package GFG;

public class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
    public Node(int data, Node next){
        this.data = data;
        this.next= next;
    }
    public static void printLinkedList(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

    }

}
