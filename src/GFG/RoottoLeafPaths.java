package GFG;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;

public class RoottoLeafPaths {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        TreeNode root = new TreeNode(10);
        TreeNode a = new TreeNode(20);
        TreeNode b = new TreeNode(30);
        root.setChild(a,b);
        a.setChild(new TreeNode(40),new TreeNode(60));

        ArrayList<ArrayList<Integer>> ans = Paths(root);
        System.out.println(ans);
    }

    public static ArrayList<ArrayList<Integer>> Paths(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        helper(root,res,path);
        return res;
    }

    private static void helper(TreeNode root, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null) {
            res.add(new ArrayList<>(path));
        }
        else{
            helper(root.left,res,path);
            helper(root.right,res,path);
        }
        path.remove(path.size()-1);

    }

}
