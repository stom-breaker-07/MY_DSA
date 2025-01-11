package MY_DSA.Leet;

public class Leet806 {
    public int[] numberOfLines(int[] widths, String s) {
        int sum=0,row=1;
        for(char c : s.toCharArray()){
            int curr=widths[c -'a'];
            if(curr + sum >100){
                sum=curr;
                row++;
            }else{
                sum+=curr;
            }
        }
        return new int[]{row, sum};
    }
}

/*Input: widths = [10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10], s = "abcdefghijklmnopqrstuvwxyz"
Output: [3,60]
Explanation: You can write s as follows:
abcdefghij  // 100 pixels wide
klmnopqrst  // 100 pixels wide
uvwxyz      // 60 pixels wide
There are a total of 3 lines, and the last line is 60 pixels wide.
Example 2:

Input: widths = [4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10], s = "bbbcccdddaaa"
Output: [2,4]
Explanation: You can write s as follows:
bbbcccdddaa  // 98 pixels wide
a            // 4 pixels wide
There are a total of 2 lines, and the last line is 4 pixels wide.*/
