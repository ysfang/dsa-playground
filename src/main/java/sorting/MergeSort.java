package sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 2, 6, 1};
        ArrayUtil.display(sort(arr, 0, arr.length - 1));
    }

    public static int[] sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
        return arr;
    }

    public static int[] merge(int arr[], int l, int m, int r) {
        /* Create temp sub-arrays */
        int leftArrLen = m - l + 1;
        int rightArrLen = r - m;
        int leftArr[] = new int[leftArrLen];
        int rightArr[] = new int[rightArrLen];

        for (int i = 0; i < leftArrLen; ++i)
            leftArr[i] = arr[l + i];
        for (int j = 0; j < rightArrLen; ++j)
            rightArr[j] = arr[m + 1 + j];

        /* Merge the temp arrays */
        int i = 0, j = 0;
        for (int n = l; n <= r; n++) {
            if (j == rightArrLen || (i < leftArrLen && leftArr[i] <= rightArr[j])) {
                arr[n] = leftArr[i];
                i++;
            } else {
                arr[n] = rightArr[j];
                j++;
            }
        }

        return arr;
    }
}
