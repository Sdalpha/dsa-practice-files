package BinarySearch;

import java.util.Scanner;

public class firstOccurence {
   
    public static void FirstOccur(int[] arr,int t ){
        int start = 0;
        int res = -1;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]==t){
                res = mid;
                end = mid - 1;
            }else{
                start = mid+1;
            }
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        FirstOccur(arr,t);
        sc.close();
    }
}
