package OOP;

import java.util.Scanner;

public class App {
        public static void main(String[] args) {
            LinkedListInt list = new LinkedListInt();
                       
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int i=0;i<n;i++){
                list.addFirst(sc.nextInt());
            }
            // list.printList();
            list.deleteLast();
            list.deleteFirst();
            list.printList();
            sc.close();
        }
}
