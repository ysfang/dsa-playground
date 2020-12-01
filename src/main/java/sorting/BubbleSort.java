package sorting;

public class BubbleSort {
    /* Compare with neighbor and swap */
    public static int[] sort(int[] arr) {
        int m = arr.length;
        while (m > 1) {
            for (int i = 0; i < m - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    ArrayUtil.swapByIdx(arr, i, i + 1);
                }
            }
            m--;
        }

        return arr;
    }
}
