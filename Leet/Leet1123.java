package MY_DSA.Leet;

public class Leet1123 {
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

    TreeNode res;
    int maxDp=-1;

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        dfs(root, 0);
        return res;
    }

    private int dfs(TreeNode node , int depth){
        if(node == null){
            maxDp=Math.max(maxDp,depth);
            return depth;
        }
        int left = dfs(node.left, depth + 1);
        int right = dfs(node.right, depth + 1);
        if (left == right && left == maxDp)
            res = node;
        return Math.max(left, right);
    }
}
