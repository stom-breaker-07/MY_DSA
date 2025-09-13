package MY_DSA.Leet;

public class Leet2657 {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int[] count=new int[n];
        int[] C=new int[n];
        int common=0;
        for(int i=0;i<n;i++){
            if(count[A[i]-1]==1){
                common++;
            }
            else{
                count[A[i]-1]++;
            }
            if(count[B[i]-1]==1){
                common++;
            }else{
                count[B[i]-1]++;
            }
            C[i]=common;
        }
        return C;
    }
    //MY CODE APPROCH

//    public int[] findThePrefixCommonArray(int[] A, int[] B) {
//        int len=A.length ,count=0;
//        List<Integer> Al=new ArrayList<>();
//        List<Integer> Bl=new ArrayList<>();
//        int[] C=new int[len];
//
//        for(int i=0;i<len;i++){
//            Al.add(A[i]);
//            Bl.add(B[i]);
//            if(Bl.indexOf(Al.get(i))!=-1 && A[i]!=B[i]){
//                count++;
//            }
//            if(Al.indexOf(Bl.get(i))!=-1){
//                count++;
//            }
//            C[i]=count;
//        }
//
//        return C;
//    }
}
