package searching;

public class TreeUtils {
    public static Node createTree(int[] arr) {
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = insertRec(root, arr[i]);
        }
        return root;
    }

    private static Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }

        return root;
    }
}
