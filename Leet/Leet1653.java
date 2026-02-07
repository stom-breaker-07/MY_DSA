package MY_DSA.Leet;

public class Leet1653 {
    public int minimumDeletions(String s) {
        int delcount=0,bcount=0;
        for(char ch : s.toCharArray()){
            if(ch == 'b'){
                bcount++;
            }
            else{
                delcount=Math.min(delcount+1,bcount);
            }
        }
        return delcount;
    }
}
