package GFG;

import java.util.*;

public class ZigZagTraversalBT {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(3);
        TreeNode c = new TreeNode(4);
        node.setChild(a,b);
        b.setChild(c,null);
        System.out.println(zigzagLevelOrder(node));

    }
    static public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int j = 0;
        while(!q.isEmpty()){
            j++;
            int levelSize = q.size();
            List<Integer> currLevelList = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode curr = q.poll();
                currLevelList.add(curr.data);
                if(curr.left!=null) q.offer(curr.left);
                if (curr.right!=null) q.offer(curr.right);
            }
            if(j%2==0){
                Collections.reverse(currLevelList);
            }
            result.add(currLevelList);
        }
        return result;
    }

}


