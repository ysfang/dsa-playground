package recursive;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {
    @Test
    public void get() {
        assertEquals(5, Fibonacci.getRecursively(5));
        assertEquals(34, Fibonacci.getRecursively(9));
    }

    @Test
    public void getWithLoopSpaceComplexityAsOne() {
        assertEquals(0, Fibonacci.getWithLoopSpaceComplexityAsOne(0));
        assertEquals(1, Fibonacci.getWithLoopSpaceComplexityAsOne(1));
        assertEquals(1, Fibonacci.getWithLoopSpaceComplexityAsOne(2));
        assertEquals(3, Fibonacci.getWithLoopSpaceComplexityAsOne(4));
        assertEquals(34, Fibonacci.getWithLoopSpaceComplexityAsOne(9));
    }

    @Test
    public void getWithLoopSpaceComplexityAsN() {
        assertEquals(0, Fibonacci.getWithLoopSpaceComplexityAsN(0));
        assertEquals(1, Fibonacci.getWithLoopSpaceComplexityAsN(1));
        assertEquals(1, Fibonacci.getWithLoopSpaceComplexityAsN(2));
        assertEquals(3, Fibonacci.getWithLoopSpaceComplexityAsN(4));
        assertEquals(34, Fibonacci.getWithLoopSpaceComplexityAsN(9));
    }
}
