import java.util.Scanner;
public class K_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum += Math.ceil((double)arr[j]/(double)arr[i]);
            }
           
            if(sum==k){
                System.out.println(arr[i]);
                return;
            }else if(sum<k){
                System.out.println(arr[i]);
                return;
            }
            
            sum = 0;
            sc.close();
        }
    }
}