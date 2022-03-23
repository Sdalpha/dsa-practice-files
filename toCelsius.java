import java.util.Scanner;

public class toCelsius {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                    int f = sc.nextInt();
                    System.out.println((f-32)*5/9);
                    sc.close(); 
        }
}
