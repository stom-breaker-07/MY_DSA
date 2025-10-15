package MY_DSA.Leet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leet637 {
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
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> result=new ArrayList<>();
        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            double sum=0,avg=0;
            int size=que.size();
            for(int i=0;i<size;i++){
                TreeNode temp=que.poll();
                sum+=(double) temp.val;
                if(temp.left!=null) que.add(temp.left);
                if(temp.right!=null) que.add(temp.right);
            }
            avg=sum/size;
            result.add(avg);
        }
        return result;
    }
}
