import java.util.Scanner;

public class SearchSortedAndRotatedArray {
        static int binarySearch(int[] arr,int key,int part,int min){
            int r = arr.length - 1;
            int l = 0;
            if(part == 1){
                r = min - 1;
            }else {
                l = min;
            }

            while(l<=r){
                int mid = (l+r)/2;
                if(arr[mid]==key){
                    return mid;
                }else if(arr[mid]<key){
                    l = mid+1;
                }else{
                    r = mid - 1;
                }
            }
            return -1;
        }

        static int minimum(int[] arr, int n){
            int index = 0;
            int min = arr[0];
            for(int i=0;i<n;i++){
                if(arr[i]<min){
                    min = arr[i];
                    index = i;
                }
            }
            return index;
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int key = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        } 
        int min = minimum(arr,n);
        if(key > arr[arr.length-1]){
            System.out.println(binarySearch(arr,key,1,min));
        }else{
            System.out.println(binarySearch(arr,key,2,min));
        }
        sc.close();
    }
}

