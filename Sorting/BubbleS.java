package MY_DSA.Sorting;

public class BubbleS {
    public static void bubbleSort(int arr[]) {
        int len=arr.length;
        while(len>0){
            for(int i=0;i<len-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            len--;
        }
    }
}

/*
* bubble sort */