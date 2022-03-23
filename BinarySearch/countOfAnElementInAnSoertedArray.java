package BinarySearch;

public class countOfAnElementInAnSoertedArray {
    static int firstOccur(int[] arr,int target){
        int start = 0;
        int res = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                res = mid;
                end = mid - 1;
            }else{
                start = start + 1;
            }
        }
        return res;
    }
    static int lastOccur(int[] arr,int target){
        int start = 0;
        int res = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                res = mid;
                start = start + 1;
            }else{
                end = mid - 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {5,7,10,10,10,12,15};
        int target = 10;
        //algoritham is :
        //first we call the first occurence and then last occurance
        // and then we calculate the first-last+1 = count of the length;

        int first = firstOccur(arr,target);
        int last = lastOccur(arr,target);
        
        System.out.println("Length of "+target+" = "+(last - first + 1));
    }
}
