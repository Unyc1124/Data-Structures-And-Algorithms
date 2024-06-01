public class KAncestor {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int kAncestor(Node root, int n, int k) {
        if (root == null) {
            return -1; // Base case: node not found
        }
        if (root.data == n) {
            return 0; // Base case: node found
        }

        int leftDist = kAncestor(root.left, n, k);
        int rightDist = kAncestor(root.right, n, k);

        if (leftDist == -1 && rightDist == -1) {
            return -1; // Node n is not found in either subtree
        }

        int dist = Math.max(leftDist, rightDist) + 1;

        if (dist == k) {
            System.out.println(root.data); // Found the k-th ancestor
        }

        return dist;
    }

    public static void main(String args[]) {
        // Tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        kAncestor(root, 5, 2); // Expecting output: 1
    }
}
