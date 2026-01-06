package MY_DSA.Leet;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class Leet1161 {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int level = 1;
        int maxSum = Integer.MIN_VALUE;
        int answerLevel = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            int levelSum = 0;

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                levelSum += node.val;

                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }

            if (levelSum > maxSum) {
                maxSum = levelSum;
                answerLevel = level;
            }

            level++;
        }

        return answerLevel;
    }
}
