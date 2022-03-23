import java.util.Scanner;

public class TowerOfHanoi {
        public static void toh(int n,String A, String B, String C){
            if(n == 1){
                System.out.println(A+"->"+C);
                return;
            }
            toh(n-1,A,C,B);
            System.out.println(A+"->"+C);
            toh(n-1,B,A,C);
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                    int n = sc.nextInt();
                    toh(n,"A","B","C");
                    sc.close(); 
        }
}
