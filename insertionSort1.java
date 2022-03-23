import java.util.Scanner;

public class insertionSort1 {
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=1;i<arr.length;i++){
            int j = i-1;
            int temp = arr[i];
            while(j>=0 && temp < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            printArray(arr);
            arr[j+1] = temp;
        }
        sc.close();
    }
}
