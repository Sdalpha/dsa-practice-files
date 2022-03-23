

import java.util.Scanner;

public class PeakElement {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                    int n = sc.nextInt();
                    int[] arr = new int[n];
                    for(int i=0;i<n;i++)
                        arr[i] = sc.nextInt();
                    
                    for(int i=0;i<n-1;i++){
                        //if incrising
                        if(arr[i]<arr[i+1]){
                            if(i==n-2)
                                System.out.print(i+1);
                            
                        }
                        //

                    }
                    sc.close(); 
        }
}
