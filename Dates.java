
import java.util.*;
public class Dates {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int testcase = 0; testcase < n; testcase++){
            String s = input.next();
            String date = new String(""), month = new String(""), year = new String("");
            int i = 0;
            while(Character.isDigit(s.charAt(i))){
                date += s.charAt(i);
                i++;
            }
            int type;
            if(s.charAt(i) == '.')
                type = 1;
            else
                type = 2;
            i++;
            while(Character.isDigit(s.charAt(i))){
                month += s.charAt(i);
                i++;
            }
            i++;
            if(type == 2){
                String temp = month;
                month = date;
                date = temp;
            }
            while(i < s.length() && Character.isDigit(s.charAt(i))){
                year += s.charAt(i);
                i++;
            }
            while(date.length()  < 2)
                date = '0' + date;
            while(month.length() < 2)
                month = '0' + month;
            while(year.length() < 4)
                year = '0' + year;
            String ans = date + '.' + month +'.' + year + ' ';
            System.out.print(ans);
            ans = month + '/' + date + '/' + year + ' ';
            System.out.print(ans);
        }
        input.close();
    }
}