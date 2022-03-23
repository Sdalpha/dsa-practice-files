import java.util.Scanner;

public class count1 {
    static void counter(int[] arr,int n){
        int start = 0;
        int end = arr.length-1;
        int ans = n;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==0){
                ans = mid;
                end = mid-1;
            }else{
                start=mid+1;
            }
        }
        System.out.println(ans);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        counter(arr,n);
        sc.close();
    }
}
