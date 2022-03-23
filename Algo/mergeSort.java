
package Algo;

public class mergeSort {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    static void merge(int[] arr, int l, int m, int r) {
        // Allocate
        // Find sizes of two subarrays to be merged
        int x1 = m - l + 1;
        int x2 = r - m;
        /* Create temp arrays */
        int left[] = new int[x1];
        int right[] = new int[x2];
        /* Copy data to temp arrays */
        for (int i = 0; i < x1; i++)
            left[i] = arr[i + l];
        for (int j = 0; j < x2; j++)
            right[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < x1 && j < x2) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        /* Copy remaining elements of L[] if any */
        while (i < x1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < x2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    static void mergeSorts(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSorts(arr, l, mid);
            mergeSorts(arr, mid + 1, r);

            merge(arr, l, mid, r);
        }
    }

    public static void main(String[] args){
        int[] arr = { 4, 2, 3, 5, 10 };
        int r = arr.length - 1;
        mergeSorts(arr, 0, r);
        printArray(arr);
    }
}
