import java.util.Scanner;
import java.util.*;
public class secondSmallest {
    public static int get(int[] a, int total){  
        Arrays.sort(a);  
        return a[1];  
        } 
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt(); 
                int[] arr = new int[n];
                for(int i=0;i<n;i++)
                {
                    arr[i] = sc.nextInt();
                }  
                System.out.println(get(arr,n));  
                
            
                sc.close();
        }
}
