// import java.util.ArrayList;
package heaps;

class heapsimp{

    public static void buildHeap(int[] arr){
        int n = arr.length;
        for(int i=(n/2)-1;i>=0;i--){
            heapify(i, arr, n);
        }
    }

    public static void heapify(int i,int[] arr,int n){
        int max = i;
        int right = 2*i+2;
        int left = 2*i+1;
        
        if(left < n && arr[left] > arr[max]){
            max = left;
        }
        if(right < n && arr[right] > arr[max]){
            max = right;
        }

        if(max!=i){
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
            heapify(max, arr, n);
        }
        
        
    }

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) throws Exception {
       
        int[] arr = {40,10,30,50,60,15};

        printArray(arr);
        buildHeap(arr);
        printArray(arr);

    }
}