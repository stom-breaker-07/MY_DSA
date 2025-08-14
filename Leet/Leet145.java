package MY_DSA.Leet;

import java.util.ArrayList;
import java.util.List;

public class Leet145 {
    public class TreeNode {
        int val;
        Leet144.TreeNode left;
        Leet144.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, Leet144.TreeNode left, Leet144.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    static void postorder(List<Integer> l , TreeNode node){
        if(node==null)return ;
        postorder(l,node.left);
        postorder(l,node.right);
        l.add(node.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list =new ArrayList<>();
        postorder(list,root);
        return list;
    }
}
