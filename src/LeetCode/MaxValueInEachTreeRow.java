package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaxValueInEachTreeRow {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode a = new TreeNode(3);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(5);
        TreeNode d = new TreeNode(3);
        TreeNode e = new TreeNode(9);
        root.setChilds(a,b);
        a.setChilds(c,d);
        b.setChilds(null,e);
        System.out.println(largestValues(root));

    }
    public static List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        q.add(root);
        while(!q.isEmpty()){
            int levelSize = q.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < levelSize; i++) {
                TreeNode curr = q.poll();
                max = Math.max(max, curr.val);
                if(curr.left!=null) q.offer(curr.left);
                if (curr.right!=null) q.offer(curr.right);
            }
            ans.add(max);

        }
        return ans;
    }
}
