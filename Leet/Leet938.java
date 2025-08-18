package MY_DSA.Leet;

public class Leet938 {
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
    static void backtrack(TreeNode node,int low ,int high,int sum){
        if(node == null) return;
        if(node.val>=low && node.val<=high) {
            sum+=node.val;
        }
        backtrack(node.left,low,high,sum);
        backtrack(node.right,low,high,sum);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        int ans=0;
        backtrack(root,low,high,ans);
        return ans;
    }
}
