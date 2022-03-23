import java.util.Scanner;

class QuickSort{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                    int n = sc.nextInt();
                    int[] arr = new int[n];
                    for(int i=0;i<n;i++){
                        arr[i] = sc.nextInt();
                    }

                    int[] temp = new int[n];
                    int k = 0;
                    int pivot = arr[0];
                    for(int i=0;i<n;i++){
                        if(arr[i]<pivot){
                            temp[k] = arr[i];
                            k++;
                        }
                    }
                    for(int i=0;i<n;i++){
                        if(arr[i]==pivot){
                            temp[k] = arr[i];
                            k++;
                        }
                    }
                    for(int i=0;i<n;i++){
                        if(arr[i]>pivot){
                            temp[k] = arr[i];
                            k++;
                        }
                    }

                    for(int i=0;i<n;i++){
                        System.out.print(temp[i]+" ");
                    }System.out.println("");
                    sc.close(); 
        }
}