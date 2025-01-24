package MY_DSA.Sorting;

public class InsertionS {
    public void insertionSort(int arr[]) {
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                j--;
            }
        }
    }
}
