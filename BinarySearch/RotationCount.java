package BinarySearch;

public class RotationCount {
    public static int RotatationCount(int[] arr){
        int n = arr.length;
        int start = 0 ;
        int end=  n-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            int next = (mid+1)%n;
            int prev = (mid-1+n)%n;
            
            //first of all we have to make sure, is the mid is pivot or not.
            //mid is pivot if it is smaller from both adjacent element;
            if(arr[mid] <=arr[next] && arr[mid] <=arr[prev]){
                return mid;
            }

            //now we have to choose the right half of the array
            //else left half of the array. 
            if(arr[start] <= arr[mid]){
                start = mid - 1;
            }else if(arr[mid] <= arr[end]){
                end = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //Find the Rotation Count in Rotated Sorted array


        int[] arr = {11,12,15,18,2,5,6,8};
        System.out.println(RotatationCount(arr));
    }
}
