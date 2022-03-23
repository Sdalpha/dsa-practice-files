import java.util.Scanner;

public class lineThemUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < n; i++) {
            if(s[i].compareTo(s[i-1]) < 0){
                increasing  = false;
            }
            if(s[i].compareTo(s[i-1]) > 0){
                decreasing  = false;
            }
        }

        if(increasing == true){
            System.out.println("INCREASING");
        }else if(decreasing == true){
            System.out.println("DECREASING");
        }
        else
        {
           System.out.println("NEITHER"); 
        }
        sc.close();
    }
}
