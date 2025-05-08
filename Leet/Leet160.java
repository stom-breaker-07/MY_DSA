package MY_DSA.Leet;

public class Leet160 {


      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            int lenA=0,lenB=0;

            ListNode TempA=headA;
            while(TempA!=null){
                lenA++;
                TempA=TempA.next;
            }

            ListNode TempB=headB;
            while(TempB!=null){
                lenB++;
                TempB=TempB.next;
            }

            int diff=Math.abs(lenA-lenB);

            TempA=headA;
            TempB=headB;

            if(lenA > lenB){
                while(diff-- > 0){
                    TempA=TempA.next;
                }
            }
            else{
                while(diff-- > 0){
                    TempB=TempB.next;
                }
            }

            while(TempA != TempB){
                TempA=TempA.next;
                TempB=TempB.next;
                if(TempA==null || TempB==null){
                    return null;
                }
            }
            return TempA;
        }
}
