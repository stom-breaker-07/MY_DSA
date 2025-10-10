import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Leet102 {
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

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        TreeNode temp=null;

        while(!q.isEmpty()){
            int levelSize=q.size();
            List<Integer> inlist=new ArrayList<>();

            for(int i=0;i<levelSize;i++){
                temp=q.poll();
                inlist.add(temp.val);

                if (temp.left != null) q.add(temp.left);
                if (temp.right != null) q.add(temp.right);
            }
            res.add(inlist);
        }

        return res;
    }
}