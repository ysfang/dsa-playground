package searching;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class BFSWithTreeTest {
    private int[] treeElements = {9, 4, 6, 20, 170, 15, 1};
    /*          9
    *      4        20
    *  1     6   15    170
    * */
    @Test
    public void testCreateTree() {
        Node tree = TreeUtils.createTree(treeElements);
        assertEquals(9, tree.value);
    }

    @Test
    public void testBFS() {
        Node tree = TreeUtils.createTree(treeElements);
        List<Integer> result = BFSWithTree.breadthFirstSearch(tree);
        List<Integer> expectedArr = Arrays.asList(9, 4, 20, 1, 6, 15, 170);
        assertEquals(expectedArr, result);
    }

    @Test
    public void testBFSR() {
        Node tree = TreeUtils.createTree(treeElements);
        List<Integer> result = BFSWithTree.breadthFirstSearchR(new ArrayList<>(), new LinkedList<>(Arrays.asList(tree)));
        List<Integer> expectedArr = Arrays.asList(9, 4, 20, 1, 6, 15, 170);
        assertEquals(expectedArr, result);
    }
}