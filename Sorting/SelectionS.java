package MY_DSA.Sorting;

public class SelectionS {
    void selectionSort(int[] arr) {
        // code here
        int len=arr.length;
        for(int i=0;i<len-1;i++){
            int min=i;
            for(int j=i+1;j<len;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
}
