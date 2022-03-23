import java.util.*;
public class Tempture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temparature");
        double c = sc.nextInt();
        double f = (9/5.0) * c + 32;
        System.out.println(f);
        sc.close();
    }
}