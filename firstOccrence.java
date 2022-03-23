

import java.util.Scanner;

public class firstOccrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        int ans=0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i]==t){
                ans = i;
                break;
            }
        }
        System.out.println(ans + 1);
        sc.close();
    }
}
