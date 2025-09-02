package MY_DSA.Leet;

public class Leet1038 {
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
    static int sum;
    static void traverse(TreeNode node){
        if(node==null) return ;
        traverse(node.right);
        sum+=node.val;
        node.val=sum;
        traverse(node.left);
    }
    public TreeNode bstToGst(TreeNode root) {
        sum=0;
        traverse(root);
        return root;
    }
}
