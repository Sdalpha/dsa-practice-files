import java.util.Scanner;

public class superDigit {
    static String superDigits(String n){
        if(n.length()==1){
           return n;
        }else{
           long sum = 0;
           for(int i = 0;i < n.length();i++)
           {
               sum += n.charAt(i) - '0';
           }
           n = Long.toString(sum);
           return superDigits(n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        String str = new String("");
        while(k>0){
             str += s;
             k--;
        }
      
        System.out.println(superDigits(str));
        sc.close();
    }
}
