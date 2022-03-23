
import java.util.Arrays;
import java.util.Scanner;

public class PriyankaAndTOys {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        for(int i=0;i<n;i++){
            w[i] = sc.nextInt();
        }
        Arrays.sort(w);
        int unit = 0;
        int weight = 0;
        for(int i=0;i<n;i++){
            unit++;
            weight = w[i] + 4;
            i++;
            while(i<n){
                if(w[i] <= weight){
                    i++;
                }else{
                    i--;
                    break;
                }
            }
        }
        System.out.println(unit);
        sc.close();
    }
}
