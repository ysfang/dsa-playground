package sorting;

public class ArrayUtil {
    public static int[] swapByIdx(int[] arr, int a, int b) {
        if (a != b) {
            int t = arr[a];
            arr[a] = arr[b];
            arr[b] = t;
        }
        return arr;
    }

    public static void display(int[] arr ) {
        System.out.print("Display array: [ ");
        for (int i =0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
