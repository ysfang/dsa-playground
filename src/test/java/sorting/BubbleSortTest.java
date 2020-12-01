package sorting;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BubbleSortTest {
    @Test
    public void testGeneral() {
        int[] arr = {3, 5, 4, 2, 6, 1};
        int[] expectedArr = {1, 2, 3, 4, 5, 6};

        int[] result = BubbleSort.sort(arr);
        assertEquals(6, result.length);
        assertArrayEquals(expectedArr, result);
    }

    @Test
    public void testSizeOne() {
        int[] arr = {3};
        int[] expectedArr = {3};

        int[] result = BubbleSort.sort(arr);
        assertEquals(1, result.length);
        assertArrayEquals(expectedArr, result);
    }
}
