package MY_DSA.Leet;

import java.util.ArrayList;

public class Leet234 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
        public boolean isPalindrome(ListNode head) {
            ListNode Link=head;
            ArrayList<Integer> arr=new ArrayList<>();

            while(Link!=null){
                arr.add(Link.val);
                Link=Link.next;
            }

            Link=head;
            int rIdx=arr.size()-1;

            while(Link!=null){
                if(Link.val !=arr.get(rIdx--)){
                    return false;
                }
                Link=Link.next;
            }

            return true;
        }

}
