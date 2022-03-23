package heaps;
public class HeapSort {
    public static void buildHeap(int[] arr){
        int n = arr.length;
        for(int i=(n/2)-1;i>=0;i--){
            heapify(arr, n, i);
        }
        heapSort(arr,n);
    }
    public static void heapSort(int[] arr, int n){
        for(int i=n-1;i>0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }
    public static void heapify(int[] arr, int n,int i){
        int max = i;
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        if(left < n && arr[max] < arr[left]){
            max = left;
        }
        if(right < n && arr[max] < arr[right]){
            max = right;
        }
        if(max != i){
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] =temp;
            heapify(arr, n, max);
        }
    }
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }System.out.println("");
    }
    public static void main(String[] args) {
        int[] arr = {40,10,30,50,60,15};
        buildHeap(arr);
        printArray(arr);
    } 
}
