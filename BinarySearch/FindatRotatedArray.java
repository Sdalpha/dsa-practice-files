package BinarySearch;

public class FindatRotatedArray {

    public static int findElement(int[] arr, int t){
        int pivot = RotatationCount(arr);

        if(pivot==-1) return BinarySearch(arr, 0, arr.length-1, t);

        if(arr[0]<=t){
            return BinarySearch(arr, 0, pivot-1, t);
        }else{
            return BinarySearch(arr, pivot+1, arr.length-1, t);
        }
    }

    public static int BinarySearch(int[] arr,int start,int end,int t){
        
        if(start>end) return 0;

            int mid = start + (end - start)/2;
            if(arr[mid]==t){
                return mid;
            }
            if(t>arr[mid])
                return BinarySearch(arr,mid+1,end, t);
            return BinarySearch(arr, start, mid-1, t);

        
    }
    public static int RotatationCount(int[] arr){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            int next = (mid+1)%n;
            int prev = (mid-1+n)%n;

            if(arr[mid]<=arr[prev] && arr[mid]<=arr[next]){
                return mid;
            }
            if(arr[start] <= arr[mid]){
                start = mid-1;
            }else if(arr[mid] <= arr[end]){
                end = mid+1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {11,12,15,18,2,5,6,8};
        System.out.println(findElement(arr, 15));
    }
}
