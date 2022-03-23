import java.util.*;
public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int student = sc.nextInt();
        int sum = 0;
        sc.close();
        for(int i=0;i<student;i++)
        {
            int subj = sc.nextInt();
            sum = sum + subj;
        }
        System.out.println(sum/student);
    }
}
