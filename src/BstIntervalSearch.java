import java.util.*;

public class BstIntervalSearch {
    static class Node {
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static class BinarySearchTree {
        Node root;
        List<Integer> result = new ArrayList<>();

        public List<Integer> searchInterval(Node node, int min, int max) {
            if (node == null) {
                return result;
            }
            if (node.data > min) {
                searchInterval(node.left, min, max);
            }
            if (node.data >= min && node.data <= max) {
                result.add(node.data);
            }
            if (node.data < max) {
                searchInterval(node.right, min, max);
            }

            return result;
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        // TODO: construct the tree

        List<Integer> result = bst.searchInterval(bst.root, 1, 2);
        Collections.sort(result);
    }
}


