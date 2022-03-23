import java.util.Scanner;

public class slidingWindowsbrutforce {
    public static int slidingWindows(int[] arr,int k){
        int maxSum = 0;
        for(int i =0;i<=arr.length - k;i++){
            int windowSum = 0;
            for(int j = i; j < i+k;j++){
                windowSum += arr[j];
            }
            maxSum = Math.max(maxSum,windowSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int k = sc.nextInt();
         int[] arr = new int[n];
         for(int i=0;i<n;i++){
             arr[i] = sc.nextInt();
         }
         System.out.println(slidingWindows(arr,k));
         sc.close();
    } // genome 
}
