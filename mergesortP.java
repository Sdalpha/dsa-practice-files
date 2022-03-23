public class mergesortP {
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void merge(int[] arr, int l,int r,int mid){
        int x1 = mid -l +1;
        int x2 = r-mid;
        int[] a = new int[x1];
        int[] b = new int[x2];

        for(int i=0;i<x1;i++)
            a[i] = arr[l+i];
        for(int j=0;j<x2;j++)
            b[j] = arr[mid + 1 +j];
        
        int i =0 ,j = 0, k = l;
        while(i<x1 && j<x2){
            if(a[i]<b[j]){
                arr[k] = a[i]; i++;
            }else{
                arr[k] = b[j]; j++;
            }
            k++;
        }
        while(i<x1){
            arr[k] = a[i];
            i++; k++;
        }
        while(j<x2){
            arr[k] = b[j];
            j++; k++;
        }
    }

    public static void mergeSort(int[] arr,int l,int r){
        if(l<r){
            int mid  = (l+r)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr,l,r,mid);
        }
    }
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 26, 8, 7, 1 };
        int r = arr.length - 1;
        int l = 0;
        mergeSort(arr, l, r);
        printArray(arr);
    }
}
