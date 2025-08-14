package MY_DSA.Leet;

import java.util.ArrayList;
import java.util.List;

public class Leet144 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    static void preorder(List<Integer> l, TreeNode node){
        if(node==null) return ;
        l.add(node.val);
        preorder(l,node.left);
        preorder(l,node.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        preorder(list,root);
        return list;
    }
}
