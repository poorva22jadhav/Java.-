class BinaryTree {
  static Node root;

     class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    void insert(int data) {
        root = recursiveInsert(root, data);
    }

    Node recursiveInsert(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = recursiveInsert(current.left, value);
        } else if (value > current.value) {
            current.right = recursiveInsert(current.right, value);
        }

        return current;
    }

    void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.println(root.value);
        inorder(root.right);
    }

    void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.println(root.value);
        preorder(root.left);
        preorder(root.right);
    }

    void postorder(Node root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.println(root.value);
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(1);
        bt.insert(2);
        bt.insert(3);
        bt.insert(4);
        bt.insert(5);
        bt.insert(6);

        System.out.println("Inorder Traversal:");
        bt.inorder(root);

        System.out.println("Preorder Traversal:");
        bt.preorder(root);

        System.out.println("Postorder Traversal:");
        bt.postorder(root);
    }
}
