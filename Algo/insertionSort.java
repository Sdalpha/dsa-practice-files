package Algo;

public class insertionSort {
    // public static void printArray(int[] arr){
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println("");
    // }
        public static void main(String[] args) {
            int arr[] = {2,1,3,1,2};
            //insersion sort
            int count = 0;
            for(int i=1;i<arr.length;i++){
                int temp = arr[i];
                int j = i-1;
                while(j>=0 && temp < arr[j]){
                    //keep swaping
                    arr[j+1] = arr[j];
                    j--;
                    count++;
                }
                arr[j+1] = temp;
            }
            // printArray(arr);
            System.out.println(count);
        }
} 
