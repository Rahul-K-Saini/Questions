package LeetCode;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class EvenOddTree {
    public static void main(String[] args) {
        TreeNode root  = new TreeNode(5);
        TreeNode a  = new TreeNode(7);
        TreeNode b  = new TreeNode(3);
        TreeNode c  = new TreeNode(9);
        TreeNode d  = new TreeNode(0);
        root.setChilds(a,b);
        b.setChilds(c,d);
        System.out.println(isEvenOddTree(root));
    }

    public static boolean isEvenOddTree(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode current = root;
        queue.add(current);

        boolean even = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            int prev = Integer.MAX_VALUE;
            if (even) {
                prev = Integer.MIN_VALUE;
            }
            while (size > 0) {
                current = queue.poll();
                if ((even && (current.val % 2 == 0 || current.val <= prev)) || (!even && (current.val % 2 == 1 || current.val >= prev))) {
                    return false;
                }
                prev = current.val;
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
                size--;
            }
            even = !even;
        }
        return true;
    }
}


