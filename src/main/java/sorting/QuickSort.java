package sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1, 8, 3, 9, 5, 4, 7};
        ArrayUtil.display(sort(arr, 0, arr.length - 1));
    }


    public static int[] sort(int[] arr, int low, int high) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] would be at right place */
            int pi = partition(arr, low, high);

            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }

        return arr;
    }


    // Put pivot at the correct position in the array. And make smaller numbers at its left, larger numbers at its right.
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low; // index where the pivot would be after this round of partition process
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                // swap arr[i] and arr[j]
                ArrayUtil.swapByIdx(arr, i, j);
                i++;
            }
        }

        // swap arr[i] and arr[high] (the pivot)
        ArrayUtil.swapByIdx(arr, i, high);

        return i;
    }
}
