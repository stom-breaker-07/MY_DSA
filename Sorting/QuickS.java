package MY_DSA.Sorting;

public class QuickS {
    public void quickSort(int[] arr, int low, int high) {
        if(low<high){
            int p=partition(arr,low,high);
            quickSort( arr, low, p-1);
            quickSort( arr, p+1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot=low;
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=arr[pivot] && i<=high-1){
                i++;
            }
            while(arr[pivot]<arr[j] && low+1<=j){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;

        return j;
    }
}
