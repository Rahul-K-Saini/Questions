package GFG;

public class SwapPairsLL {
    public static void main(String[] args) {
        //call func
    }
    public Node swapPairs(Node head) {
        Node curr=head;
        Node nex=null;
        Node prev=null;

        int count=0;
        while(curr!=null && count<2){
            nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
            count++;
        }

        if(nex!=null){
            head.next=swapPairs(nex);
        }
        return prev;
    }
}
