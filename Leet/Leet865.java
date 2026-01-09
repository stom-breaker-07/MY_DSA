package MY_DSA.Leet;

public class Leet865 {
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

    static int getMaxD(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(getMaxD(root.left),getMaxD(root.right));
    }

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if(root == null) return null;

        int LMaxD=getMaxD(root.left);
        int RMaxD=getMaxD(root.right);

        if(LMaxD==RMaxD){
            return root;
        }
        if(LMaxD > RMaxD){
            return subtreeWithAllDeepest(root.left);
        }
        return subtreeWithAllDeepest(root.right);
    }
}
