package MY_DSA.BinarySearch;

/* Main ly used when give array is sorted */
public class BS01 {
    static int SearchT(int[] nums,int tar){
        int i=0 ,j=nums.length-1;
        while(i<j){
            int m=i+(j-i)/2;
            if(nums[m]==tar){
                return m;
            } else if (nums[m]<tar) {
                i=m+1;
            }
            else{
                j=m-1;
            }
        }
        return -1;
    }
    /*Throuh Recursion Bs*/
    static int SearchRecT(int []nums ,int St ,int End ,int tar){
        if(St>End){
            return -1;
        }
        int m=St+(End-St)/2;
        if(nums[m]==tar){
            return m;
        } else if (nums[m]<tar) {
            return SearchRecT(nums,m+1,End,tar);
        } else {
            return SearchRecT(nums,St,m-1,tar);
        }

    }
    /* For First Occurence */
    static int SearchFo(int[] nums,int tar){
        int i=0,j=nums.length-1;
        int Fo=-1;
        while(i<=j){
            int m=i+(j-i)/2;
            if(nums[m]==tar){
                Fo=m;
                j=m-1;
            } else if (nums[m]>tar) {
                j=m-1;
            }else {
                i=m+1;
            }
        }
        return Fo;
    }
    public static void main(String[] args) {
        int[] n={1,2,3,3,3,4,4,5,6};
        int t=4;
        System.out.println(SearchRecT(n,0,n.length-1,t));
        System.out.println(SearchFo(n,t));
    }
}
