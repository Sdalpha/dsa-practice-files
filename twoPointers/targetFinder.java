import java.util.Arrays;
import java.util.Scanner;

public class targetFinder {
    static boolean target(int[] arr,int t){
        Arrays.sort(arr);
        int start = 0,sum = 0;
        int end = arr.length - 1;
        while(start<end){
            sum = arr[start] + arr[end];
            if(t == sum){
                return true;
            }else if(sum < t){
                start++;
            }else{
                end--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(target(arr,t));
    }
}
