
import java.util.*;

public class insertionSort2 {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                }

                for (int i = 1; i < n; i++) {
                        for (int j = i; j > 0; j--) {
                                if (arr[j] < arr[j - 1]) {
                                        int temp = arr[j];
                                        arr[j] = arr[j - 1];
                                        arr[j - 1] = temp;
                                }
                        }
                        for(int j=0;j<n;j++){
                                System.out.print(arr[j]+" ");
                        }System.out.println("");
                }
                sc.close();
        }
}