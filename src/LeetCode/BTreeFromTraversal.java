package LeetCode;

import com.sun.source.tree.Tree;

import java.util.HashMap;

public class BTreeFromTraversal {
    public static void main(String[] args) {
        TreeNode head = buildTree(new int[]{3,9,20,15,7},new int[]{9,3,15,20,7});
        printTree(head);
    }
    public static  TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }
        int[] index = {0};
        return helper(preorder,inorder,0,preorder.length-1,map,index);
    }

    private static TreeNode helper(int[] preorder, int[] inorder, int left, int right, HashMap<Integer, Integer> map,int[] index) {
        if(left>right){
            return null;
        }

        int curr = preorder[index[0]];
        index[0]++;

        TreeNode node = new TreeNode(curr);

        if(left==right) return node;

        int inorderIndex = map.get(curr);

        node.left = helper(preorder,inorder,left,inorderIndex-1,map,index);
        node.right = helper(preorder,inorder,inorderIndex+1,right,map,index);

        return node;
    }

    static void printTree(TreeNode node){
        if (node == null) return;
        printTree(node.left);
        System.out.print(node.val+" ");
        printTree(node.right);
    }
}
