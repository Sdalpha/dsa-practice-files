package OOP;

import java.util.*;
class Main{
        public static void main(String[] args) {
            LinkedList<Integer> list = new LinkedList<Integer>();
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int i=0;i<n;i++){
                list.addLast(sc.nextInt());
            }
            if(list.size()==1){
                System.out.println("-1");
            }
            if(list.size()%2==1){ //odd case
                int mid = (int) Math.floor(list.size()/2);
                list.remove(mid);
            }else{
                int mid = list.size()/2;
                list.remove(mid);
            }
            for(int i=0;i<n-1;i++){
                System.out.print(list.get(i)+" ");
            }
            sc.close();
        }
}