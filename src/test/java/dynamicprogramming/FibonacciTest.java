package dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
    /* fibonacci sequence list:
     * idx: 0, 1, 2, 3, 4, 5, 6,  7,  8,  9
     * val: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
     */
    @Test
    public void testCalculateWithDP() {
        assertEquals(2L, Fibonacci.calculateDP(3));
        assertEquals(34L, Fibonacci.calculateDP(9));
        // Upper bound of long: 9,223,372,036,854,775,807
        assertEquals(23416728348467685L, Fibonacci.calculateDP(80));
    }
}
