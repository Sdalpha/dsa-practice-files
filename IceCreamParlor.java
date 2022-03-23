import java.util.Scanner;

public class IceCreamParlor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int testcase=0;testcase<t;testcase++){
            int m = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[k];
            for(int i=0;i<k;i++){
                arr[i] = sc.nextInt();
            }
            for(int j=0;j<k;j++){
                for(int i=j+1;i<k;i++){
                    if(arr[j]+arr[i]==m){
                        System.out.println((j+1)+" "+(i+1));
                    }
                }
            }
        }
        sc.close();
    }
}
