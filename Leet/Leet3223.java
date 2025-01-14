package MY_DSA.Leet;

public class Leet3223 {
    public int minimumLength(String s) {
        int total=0;
        int[] arr=new int[26];
        for(char c : s.toCharArray()){
            arr[c -'a']++;
        }
        for(int i : arr){
            if(i==0)continue;
            if(i%2==0){
                total+=2;
            }
            else{
                total++;
            }
        }
        return total;
    }
}

/*
 You can perform the following process on s any number of times:

Choose an index i in the string such that there is at least one character to the left of index i that is equal to s[i], and at least one character to the right that is also equal to s[i].
Delete the closest character to the left of index i that is equal to s[i].
Delete the closest character to the right of index i that is equal to s[i].
Return the minimum length of the final string s that you can achieve.
*/