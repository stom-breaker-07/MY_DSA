package MY_DSA.Sorting;

public class MergeS {
    static void mergeSort(int arr[], int l, int r) {
        int mid=(l+r)/2;
        if(l>=r) return;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);

    }
    static void merge(int arr[] ,int l ,int m, int r){
        int len=r-l+1;
        int[] temp=new int[len];
        int idx=0;

        int left=l;
        int right=m+1;

        while(left<=m && right<=r){
            if(arr[left]<=arr[right]){
                temp[idx++]=arr[left++];
            }
            else{
                temp[idx++]=arr[right++];
            }
        }

        while(left<=m){
            temp[idx++]=arr[left++];
        }
        while(right<=r){
            temp[idx++]=arr[right++];
        }

        for(int i=0;i<temp.length;i++){
            arr[l+i]=temp[i];
        }

    }
}
