import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] arr,int t){
        for(int j=0;j<arr.length;j++){
            if(arr[j]==t){
                return j;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of n ? :");
        int n = sc.nextInt();
        System.out.println("enter the elements of array : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("target : ");
        int t = sc.nextInt();
        System.out.println(linearSearch(arr,t));
        sc.close();
    }
}
