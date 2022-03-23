package Algo;

import java.util.Scanner;

public class BinarySearch {
    static int binarySearch(int[] arr,int t){
        int start = 0;
        int end  = arr.length-1;

        while(start<=end){
            int mid = (start + end )/2;
            if(arr[mid]==t){
                return mid;
            }
            else if(arr[mid]>t){
                end = mid-1;
            }
            else{
                start = mid+1; 
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(binarySearch(arr,t));
        sc.close();
    }
}
