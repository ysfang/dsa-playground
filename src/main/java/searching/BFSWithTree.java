package searching;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSWithTree {
    public static List<Integer> breadthFirstSearch(Node node) {
        List<Integer> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            result.add(current.value);
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }

        return result;
    }

    public static List<Integer> breadthFirstSearchR(List<Integer> result, Queue<Node> queue) {
        if (queue.isEmpty()) {
            return result;
        }

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            result.add(current.value);
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }

        return breadthFirstSearchR(result, queue);
    }
}
