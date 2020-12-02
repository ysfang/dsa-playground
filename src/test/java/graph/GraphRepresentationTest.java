package graph;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class GraphRepresentationTest {
    @Test
    public void testGetEdgeList() {
        int[][] data = GraphRepresentation.getEdgeList();
        int[] expectedArr0 = {0, 2};

        assertEquals(4, data.length);
        assertArrayEquals(expectedArr0, data[0]);
    }

    @Test
    public void testGetAdjacentList() {
        int[][] data = GraphRepresentation.getAdjacentList();
        int[] expectedArr2 = {0, 1, 3};

        assertEquals(4, data.length);
        assertArrayEquals(expectedArr2, data[2]);
    }

    @Test
    public void testGetAdjacentMatrix() {
        int[][] data = GraphRepresentation.getAdjacentMatrix();

        assertEquals(4, data.length);
        assertEquals(4, data[0].length);
        assertEquals(4, data[1].length);
        assertEquals(4, data[2].length);
        assertEquals(4, data[3].length);
    }
}