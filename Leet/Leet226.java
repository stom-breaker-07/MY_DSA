package MY_DSA.Leet;

public class Leet226 {
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
    public TreeNode invertTree(TreeNode root) {
        if(root==null || root.left==null && root.right==null ) return root;
        TreeNode Left=invertTree(root.left);
        TreeNode Right=invertTree(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }
}
