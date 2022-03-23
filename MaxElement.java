import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (sc.hasNextInt()) {
            int value = sc.nextInt();
            if (max < value) {
                max = value;
            }
        }
        System.out.println(max);
        sc.close();
    }
}
