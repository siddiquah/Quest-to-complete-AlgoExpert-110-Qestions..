class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}
class Bt {
    Node root;

    Bt(int key) {
        root = new Node(key);
    }

    Bt() {
        root = null;
    }

    // Inorder
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.key);
            traverseInOrder(node.right);
        }
    }

    // Postorder
    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.key);
        }
    }

    // Preorder
    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.key);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public static void main(String[] args) {
        Bt tree = new Bt();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("Pre order Traversal is ");
        tree.traversePreOrder(tree.root);
        System.out.println("\n In order Traversal is ");
        tree.traverseInOrder(tree.root);
        System.out.println("\n Post order Traversal is ");
        tree.traversePostOrder(tree.root);
    }
}