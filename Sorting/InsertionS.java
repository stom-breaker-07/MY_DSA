package MY_DSA.Sorting;

public class InsertionS {
    public void insertionSort(int arr[]) {
        // code here
        int len=arr.length;
        for(int i=0;i<len-1;i++){
            int j=i;
            while(j>=0 && arr[j+1]<arr[j]){
                int temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }
}
