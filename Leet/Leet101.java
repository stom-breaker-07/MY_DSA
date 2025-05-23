package MY_DSA.Leet;

public class Leet101 {
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
    static boolean isMirror(TreeNode n1,TreeNode n2){
        if(n1 == null && n2 == null) return true;
        if(n1 == null || n2 == null) return false;
        if(n1.val == n2.val){
            return isMirror(n1.left,n2.right)&& isMirror(n1.right,n2.left);
        }
        return false;
    }
    public boolean isSymmetric(TreeNode root) {
            return isMirror(root.right,root.left);
    }
}
