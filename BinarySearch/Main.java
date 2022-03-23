package BinarySearch;

import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String input = new String();
        for(int i = 0;i<=s.length()-1;i++){
            if(Character.isLetter(s.charAt(i))){
                input += s.charAt(i);
            }
        }
        input = input.toLowerCase();
        System.out.println(input);
        String reverse = new String();
        for(int i = input.length()-1;i>=0;i--){
            reverse += input.charAt(i);
        }
        System.out.println(input.equals(reverse));
        
    }
}