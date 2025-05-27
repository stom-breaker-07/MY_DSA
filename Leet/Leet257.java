package MY_DSA.Leet;

import java.util.ArrayList;
import java.util.List;

public class Leet257 {
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
        private void tree(TreeNode root, List<String> ans, StringBuilder s) {
            int len = s.length();
            s.append(root.val);
            if (root.left == null && root.right == null) {
                ans.add(s.toString());
            } else {
                s.append("->");
                if (root.left != null) tree(root.left, ans, s);
                if (root.right != null) tree(root.right, ans, s);
            }
            s.setLength(len);
        }
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> result = new ArrayList<>();
            if (root != null) {
                tree(root, result, new StringBuilder());
            }
            return result;
        }
}
/*Given the root of a binary tree, return all root-to-leaf paths in any order.

A leaf is a node with no children.

Example 1:


Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]
Example 2:

Input: root = [1]
Output: ["1"]


Constraints:

The number of nodes in the tree is in the range [1, 100].
-100 <= Node.val <= 100*/