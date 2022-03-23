package heaps;

// this is the code of maxheap;
public class heapimp2 {
    public static void buildHeap(int[] arr, int n){
        for(int i = (n/2)-1;i>=0;i--){
            heapify(arr,i,n);
        }
    }

    public static void heapify(int[] arr, int i, int n){
        int max = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left < n && arr[left] < arr[max]){
            max = left;
        }
        if(right < n && arr[right] < arr[max]){
            max = right;
        }
        if(max!=i){
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
            heapify(arr, max, n);
        }
    }

    public static void print(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }System.out.println("");
    }

    public static void main(String[] args) {
        int[] arr = {40,10,30,50,60};
        int n = arr.length;
        print(arr);
        buildHeap(arr,n);
        print(arr);
    }
}
