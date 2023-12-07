//package GFG;
//
//public class MinDepthOfBT {
//    public static void main(String[] args) {
//        Node root = new Node(1);
//        Node a = new Node(2);
//        Node b =new Node(3);
//        Node c = new Node(4);
//        Node d = new Node(5);
//        root.setChild(a,b);
//        b.setChild(c,null);
//        c.setChild(null,d);
//        System.out.println(minDepth(root));
//    }
//    static int minDepth(Node root)
//    {
//        if(root==null) return 0;
//        if(root.left ==null && root.right == null){
//            return 1;
//        }
//        if(root.left == null) return 1 + minDepth(root.right);
//        if(root.right == null) return 1 + minDepth(root.left);
//        return 1+Math.min(minDepth(root.left), minDepth(root.right));
//    }
//}
