
import java.util.*;
public class TwoSum {
    static class Pair{
        public int key;
        public int value;
        public Pair(int key, int value){
            this.key = key;
            this.value = value;
        }
        public int Key(){
            return key;
        }
        public int Value(){
            return value;
        }
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int t = input.nextInt();
        Pair[] a = new Pair[n];
        for(int i = 0; i < n; i++){
            int x = input.nextInt();
            a[i] = new Pair(x, i);
        }

        Arrays.sort(a, new Comparator<Pair>(){
            @Override
            public int compare(Pair a, Pair b){
                if(a.key != b.key)
                    return a.key - b.key;
                return a.value - b.value;
            }
        });

        int l = 0, r = n - 1;
        while(l < r){
            int sum = a[l].Key() + a[r].Key();
            if(sum == t){
                System.out.print(Math.min(a[l].Value(), a[r].Value()));
                System.out.print(' ');
                System.out.print(Math.max(a[l].Value(), a[r].Value()));
                break;
            }else if(sum < t)
                l++;
            else
                r--;
        }
        input.close();
    }
}