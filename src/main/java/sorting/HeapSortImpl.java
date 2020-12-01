package sorting;

public class HeapSortImpl {
    static int[] arr = {10, 9, 1, 2, 5, 3, 8, 7, 12, 11};
    public static void main(String[] args) {

        ArrayUtil.display(arr);
        // How a heap build: find out all parent nodes to compare with children
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            heapify(arr, i);
        }
        ArrayUtil.display(arr);
    }

    public static void heapify(int[] arr, int i) {
        int smallestIdx = i;
        int lIdx = i * 2 + 1;
        int rIdx = i * 2 + 2;

        if (lIdx < arr.length && arr[lIdx] < arr[smallestIdx]) {
            smallestIdx = lIdx;
        }
        if (rIdx < arr.length && arr[rIdx] < arr[smallestIdx]) {
            smallestIdx = rIdx;
        }
        if (smallestIdx != i) {
            ArrayUtil.swapByIdx(arr, i, smallestIdx);
//            ArrayUtil.display(arr);
            heapify(arr, smallestIdx);
        }
    }

}