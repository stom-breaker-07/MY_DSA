package MY_DSA.Array;

public class decrypt {
    public int[] decrypt(int[] code, int k) {
        int len=code.length;
        int[] result=new int[code.length];
        for(int i=0; i<len ; i++){
            if(k==0){
                for(int n:result){
                    result[n]=0;
                }
            }
            if(k>0){
                for(int j=1 ;j<=k;j++){
                    result[i] += code[( (i+j) % len )];
                }
            }
            else{
                for(int j = 1; j <= -k; j++){
                    result[i] += code[(i - j + len) % len];
                }
            }

        }

        return result ;
    }
}


//You have a bomb to defuse, and your time is running out! Your informer will provide you with a circular array code of length of n and a key k.

//To decrypt the code, you must replace every number. All the numbers are replaced simultaneously.

//If k > 0, replace the ith number with the sum of the next k numbers.
//If k < 0, replace the ith number with the sum of the previous k numbers.
//If k == 0, replace the ith number with 0.
//As code is circular, the next element of code[n-1] is code[0], and the previous element of code[0] is code[n-1].

//Given the circular array code and an integer key k, return the decrypted code to defuse the bomb!


//Example 1:

//Input: code = [5,7,1,4], k = 3
//Output: [12,10,16,13]
//Explanation: Each number is replaced by the sum of the next 3 numbers. The decrypted code is [7+1+4, 1+4+5, 4+5+7, 5+7+1]. Notice that the numbers wrap around.