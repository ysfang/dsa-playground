package dsa.playground.recursive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {
    /* fibonacci sequence list:
     * idx: 0, 1, 2, 3, 4, 5, 6,  7,  8,  9
     * val: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
     */

    public static int getRecursively(int idx) {
        if (idx < 2) {
            return idx;
        } else {
            return getRecursively(idx - 1) + getRecursively(idx - 2);
        }
    }

    public static int getWithLoopSpaceComplexityAsOne(int idx) {
        int temp = 0;
        int a = 0, b = 0;
        for (int i = 0; i <= idx; i++) {
            if (i == 1) {
                b = 1;
            } else if (i >= 2) {
                temp = a + b;
                a = b;
                b = temp;
            }
        }
        return b;
    }

    public static int getWithLoopSpaceComplexityAsN(int idx) {
        List<Integer> li = new ArrayList(Arrays.asList(0, 1));
        for (int i = 2; i <= idx; i++) {
            li.add(li.get(i - 2) + li.get(i - 1));
        }
        return li.get(idx);
    }
}
