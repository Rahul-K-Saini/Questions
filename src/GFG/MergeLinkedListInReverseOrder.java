package GFG;

import java.util.ArrayList;

public class MergeLinkedListInReverseOrder {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        node1.next = new Node(3);
        Node node2 = new Node(2);
        node2.next = new Node(4);
        Node ans = mergeResult(node1,node2);
        while (ans!=null){
            System.out.println(ans.data);
            ans = ans.next;
        }
    }
    static Node mergeResult(Node node1, Node node2)
    {
        ArrayList<Node> arr1 = new ArrayList<>();
        ArrayList<Node> arr2 = new ArrayList<>();
        while(node1!=null){
            arr1.add(node1);
            node1= node1.next;
        }
        while(node2!=null){
            arr2.add(node2);
            node2 = node2.next;
        }
        int ptr1 = arr1.size()-1;
        int ptr2 = arr2.size()-1;
        Node ans = new Node(-1);
        Node temp = ans;
        while(ptr1 >= 0 && ptr2 >=0){
            if(arr1.get(ptr1).data>arr2.get(ptr2).data){
                temp.next = arr1.get(ptr1);
                ptr1--;
            }
            else{
                temp.next = arr2.get(ptr2);
                ptr2--;
            }
            temp = temp.next;
        }
        while(ptr1>=0){
            temp.next = arr1.get(ptr1);
            ptr1--;
            temp = temp.next;
        }
        while(ptr2>=0){
            temp.next = arr2.get(ptr2);
            ptr2--;
            temp = temp.next;
        }
        temp.next = null;
        return ans.next;
    }
}
