package GFG;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        left=null;
        right=null;
    }
    void setChild(TreeNode left, TreeNode right){
        this.left = left;
        this.right = right;
    }
}