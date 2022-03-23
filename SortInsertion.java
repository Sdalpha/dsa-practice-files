import java.util.Scanner;

public class SortInsertion {
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println("");
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                int temp = arr[i];
                int j = i-1;
                while(j>=0 && temp<arr[j]){
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1] = temp;
            }
            printArray(arr);
            sc.close();
        }
}
