import java.util.Scanner;
// import java.util.*;
// import java.io.*;
public class TwoSumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i] + arr[j] == target){
                    System.out.println(i+" "+j);
                    break;
                }
            }
        }
        sc.close();
    }
}


//
