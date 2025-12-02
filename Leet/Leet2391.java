package MY_DSA.Leet;

public class Leet2391 {
    public int garbageCollection(String[] garbage, int[] travel) {
        int sum=0 ,Pmax=-1,Mmax=-1,Gmax=-1;
        // prefix sum
        for(int j=1;j<travel.length;j++){
            travel[j]+=travel[j-1];
        }

        for(int i=0;i<garbage.length;i++){
            String s = garbage[i];
            sum+=s.length();
            if( s.indexOf('M')!=-1){
                Mmax=i-1;
            }
            if( s.indexOf('P')!=-1){
                Pmax=i-1;
            }
            if( s.indexOf('G')!=-1){
                Gmax=i-1;
            }
        }
        sum+=(Gmax!=-1)? travel[Gmax]:0;
        sum+=(Pmax!=-1)? travel[Pmax]:0;
        sum+=(Mmax!=-1)?travel[Mmax]:0;
        return sum;
    }
}
