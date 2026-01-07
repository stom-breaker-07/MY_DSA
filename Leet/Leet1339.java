package MY_DSA.Leet;

public class Leet1339 {
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

    long maxProduct = 0;
    long totalSum = 0;
    public long getTotalSum(TreeNode root) {
        if (root == null) return 0;
        return root.val + getTotalSum(root.left) + getTotalSum(root.right);
    }
    public long dfs(TreeNode root) {
        if (root == null) return 0;

        long leftSum = dfs(root.left);
        long rightSum = dfs(root.right);
        long subTreeSum = leftSum + rightSum + root.val;
        long product = subTreeSum * (totalSum - subTreeSum);
        maxProduct = Math.max(maxProduct, product);
        return subTreeSum;
    }

    public int maxProduct(TreeNode root) {
        totalSum = getTotalSum(root);
        dfs(root);
        return (int)(maxProduct % 1000000007);
    }
}
