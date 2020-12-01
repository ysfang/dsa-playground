package sorting;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class InsertionSortTest {
    @Test
    public void testGeneral() {
        int[] arr = {3, 5, 4, 2, 6, 1};
        int[] expectedArr = {1, 2, 3, 4, 5, 6};

        int[] result = InsertionSort.sort(arr);
        assertEquals(6, result.length);
        assertArrayEquals(expectedArr, result);
    }
}
