import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int books = sc.nextInt();
        int time = sc.nextInt();
        int[] arr = new int[books];
        int s = 0, j =0;
        for(int i=0;i<books;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<books;i++){
            s+=arr[i];
            if(s>time){
                s-=arr[j];
                j++;
            }
        }
        System.out.println(books-j);
        sc.close();
    }
}
