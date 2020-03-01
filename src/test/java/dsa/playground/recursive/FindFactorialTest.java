package dsa.playground.recursive;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindFactorialTest {
    @Test
    public void findOneWithRecursive() {
        assertEquals(1, FindFactorial.findRecursively(1));
        assertEquals(2, FindFactorial.findRecursively(2));
        assertEquals(6, FindFactorial.findRecursively(3));
        assertEquals(24, FindFactorial.findRecursively(4));
        assertEquals(120, FindFactorial.findRecursively(5));
    }

    @Test
    public void findWithLoop() {
        assertEquals(1, FindFactorial.findWithLoop(1));
        assertEquals(2, FindFactorial.findWithLoop(2));
        assertEquals(6, FindFactorial.findWithLoop(3));
        assertEquals(24, FindFactorial.findWithLoop(4));
        assertEquals(120, FindFactorial.findWithLoop(5));
    }
}
