package sorting;

public class InsertionSort {
    /* Create sub group with size 1 at the front, move edge element into sub group by bubble sorting in each round. */
    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    ArrayUtil.swapByIdx(arr, j - 1, j);
                }
            }
        }

        return arr;
    }
}
