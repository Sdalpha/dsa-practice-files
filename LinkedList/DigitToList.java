package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class DigitToList{
        public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int rem = 0;            
        int n = sc.nextInt();
        int sum = n+1;
                    while(sum>0){
                        rem = (int)sum%10;
                        list.addFirst(rem);
                        sum = sum/10;
                    }
                    for(int i=0;i<list.size();i++){
                        System.out.print(list.get(i)+" ");
                    }
                    sc.close(); 
        }
}