package searching;

import java.util.ArrayList;
import java.util.List;

public class DFSWithTree {
    public static List<Integer> preorderTraverse(Node node, ArrayList<Integer> result) {
        if (node != null) {
            result.add(node.value);
            if (node.left != null) {
                preorderTraverse(node.left, result);
            }
            if (node.right != null) {
                preorderTraverse(node.right, result);
            }
        }

        return result;
    }

    public static List<Integer> inorderTraverse(Node node, List<Integer> result) {
        if (node != null) {
            if (node.left != null) {
                inorderTraverse(node.left, result);
            }
            result.add(node.value);
            if (node.right != null) {
                inorderTraverse(node.right, result);
            }
        }

        return result;
    }

    public static List<Integer> postorderTraverse(Node node, ArrayList<Integer> result) {
        if (node != null) {
            if (node.left != null) {
                postorderTraverse(node.left, result);
            }
            if (node.right != null) {
                postorderTraverse(node.right, result);
            }
            result.add(node.value);
        }

        return result;
    }
}
