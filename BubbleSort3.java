import java.util.Scanner;


public class BubbleSort3 {
    
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                    int n = sc.nextInt();
                    int[] arr = new int[n];

                    for(int i=0;i<n;i++){
                        arr[i] = sc.nextInt();
                    }
                    int count = 0;
                    for(int i=0;i<n-1;i++){
                        for(int j=0;j<n-i-1;j++){
                            if(arr[j]>arr[j+1]){
                                count++;
                                int temp = arr[j];
                                arr[j] = arr[j+1];
                                arr[j+1] = temp;
                            }
                        }
                        
                    }
                    int first = arr[0];
                    int last = arr[n-1];
                
                    System.out.println("Array is sorted in "+count+" swaps.");
                    System.out.println("First Element: "+first);
                    System.out.println("Last Element: "+last);
                    sc.close(); 
                }
}
