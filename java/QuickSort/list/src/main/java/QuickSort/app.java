package QuickSort;

import java.util.Arrays;

public class app {
    public static void main(String[] args) {
        int[] arr = {8, 4, 23, 42, 16, 15};
        int n = arr.length;

        QuickSort(arr, 0, n - 1);
        System.out.println("output->" + Arrays.toString(arr));
    }

    public static void QuickSort(int[] arr, int left, int right) {

        if (left < right) {
            System.out.println("\n");
            System.out.println( "input->"+ Arrays.toString(Arrays.copyOfRange(arr, left, right + 1)));
            System.out.println("from index "+left+" to index "+ (right));

            // Partition the array by setting the position of the pivot value
            int position = Partition(arr, left, right);
            // Sort the left
            System.out.println("left");
            System.out.println("left "+left+" right "+ (position-1));
            QuickSort(arr, left, position - 1);
            // Sort the right
            System.out.println("right");
            System.out.println("left "+(position+1)+" right "+ right);
            QuickSort(arr, position + 1, right);
            //   System.out.println(Arrays.toString(Arrays.copyOfRange(arr,position + 1, right)));
        }

    }


    public static int Partition(int[] arr, int left, int right) {
        // set a pivot value as a point of reference
        int pivot = arr[right];
        System.out.println("at pivot :" + pivot + " " + Arrays.toString(Arrays.copyOfRange(arr, left, right + 1)));
        // create a variable to track the largest index of numbers lower than the defined pivot
        int low = left - 1;
        for (int i = left; i <= right - 1; i++) {

            if (arr[i] <= pivot) {
                low++;
                System.out.println("Swap :" + pivot + " with " + arr[i]);

                Swap(arr, i, low);
            }
        }

        // place the value of the pivot location in the middle.
        // all numbers smaller than the pivot are on the left, larger on the right.
        Swap(arr, right, low + 1);
        System.out.println("return after  swap" + Arrays.toString(arr));
        // return the pivot index point
        return low + 1;
    }

    public static void Swap(int[] arr, int i, int low) {
        int temp;
        temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;
    }

}
