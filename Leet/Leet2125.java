package MY_DSA.Leet;

public class Leet2125 {
    static int getcount(String s){
        int cnt=0;
        for(char c:s.toCharArray()){
            if(c == '1'){
                cnt++;
            }
        }
        return cnt;
    }

    public int numberOfBeams(String[] bank) {
        int Bcount=0,j=0;
        int currentL=0,currentB=0;
        while(currentL==0 && j<bank.length){
            currentL=getcount(bank[j]);
            j++;
        }
        for(int i=j;i<bank.length;i++){
            currentB=getcount(bank[i]);
            if(currentB * currentL > 0){
                Bcount+= currentB * currentL;
                currentL=currentB;
            }
        }
        return Bcount;
    }}
