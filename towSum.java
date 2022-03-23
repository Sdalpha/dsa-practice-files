import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class towSum {
    static class Pair{
       public int key;
       public int value;
       public Pair(int key,int value){
            this.key = key;
            this.value = value;
        }
        public int key(){
            return key;
        }
        public int value(){
            return value;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        Pair[] arr = new Pair[n];
        for(int i=0;i<n;i++){
            arr[i] = new Pair(sc.nextInt(),i);
        }

        Arrays.sort(arr, new Comparator<Pair>(){
            @Override
            public int compare(Pair a,Pair b){
                return a.key - a.key;
            }
        });

        int l = 0; int r = n-1;
        while(l<r){
            int sum = arr[l].key() + arr[r].key();
            if(sum==t){
                System.out.print(Math.max(arr[l].value(),arr[r].value()));
                System.out.println();
                System.out.println(Math.min(arr[l].value(),arr[r].value()));
                break;
            }else if(sum < t){
                l++;
            }else{
                r--;
            }
        }
    }
}
