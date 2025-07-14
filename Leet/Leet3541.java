package MY_DSA.Leet;

public class Leet3541 {
    public int maxFreqSum(String s) {
        int[] alpha=new int[26];
        for(char i :s.toCharArray()){
            alpha[i-97]+=1;
        }
        int maxA=0,maxC=0;
        for(int i=0;i<alpha.length;i++){
            if(i==0 || i==4 || i==8 || i==14 || i==20){
                maxA=Math.max(maxA,alpha[i]);
            }else{
                if(alpha[i]>maxC){
                    maxC=alpha[i];
                }
            }
        }
        return maxA+maxC;
    }
}
