package searching;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DFSWithTreeTest {
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
    public void testPreorderTraverse() {
        Node tree = TreeUtils.createTree(treeElements);
        List<Integer> result = DFSWithTree.preorderTraverse(tree, new ArrayList<>());
        List<Integer> expectedArr = Arrays.asList(9, 4, 1, 6, 20, 15, 170);
        assertEquals(expectedArr, result);
    }

    @Test
    public void testInorderTraverse() {
        Node tree = TreeUtils.createTree(treeElements);
        List<Integer> result = DFSWithTree.inorderTraverse(tree, new ArrayList<>());
        List<Integer> expectedArr = Arrays.asList(1, 4, 6, 9, 15, 20, 170);
        assertEquals(expectedArr, result);
    }

    @Test
    public void testPostorderTraverse() {
        Node tree = TreeUtils.createTree(treeElements);
        List<Integer> result = DFSWithTree.postorderTraverse(tree, new ArrayList<>());
        List<Integer> expectedArr = Arrays.asList(1, 6, 4, 15, 170, 20, 9);
        assertEquals(expectedArr, result);
    }

}