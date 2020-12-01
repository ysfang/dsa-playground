package sorting;

public class SelectionSort {
    /* Search index with min value then swap to the front in each round */
    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            ArrayUtil.swapByIdx(arr, i, minIndex);
        }

        return arr;
    }
}
