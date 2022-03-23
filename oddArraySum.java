import java.util.Scanner;

public class oddArraySum {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
                   int sum = 0;
                while(sc.hasNextInt()){
                    int n = sc.nextInt();
                    if(n%2!=0){
                        sum += n;
                    }
                }
                System.out.println(sum);
                sc.close();
        }
}
