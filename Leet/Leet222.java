package MY_DSA.Leet;

public class Leet222 {

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

    private int count=0;
    private void countNode(TreeNode root){
        if(root == null) return;
        count++;
        countNode(root.left);
        countNode(root.right);
    }
    public int countNodes(TreeNode root) {
        count = 0;
        countNode(root);
        return count;
    }
}
