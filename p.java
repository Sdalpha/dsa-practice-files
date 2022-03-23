import java.util.Scanner;

public class p {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int V = sc.nextInt();
        int T = 273;
        double R = 8.314;
        double n = 6.02214076 * Math.pow(10,23);

        double cal = (n*R*T)/V;
        System.out.println(cal);
    }
}
