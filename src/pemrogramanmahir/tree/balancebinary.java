package pemrogramanmahir.tree;
import java.util.*;

public class balancebinary {
    // program java untuk mengkonversi BST yang tidak balance menjadi balanced BST.

    /* sebuah binary tree node memiliki data, mengarah ke left(anak kiri) child
    dan mengarah ke right child(anak kanan) */
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static class BinaryTree {
        Node root;

        /* fungsi ini melintasi skewed binary tree dan menyimpan titik node menjadi vector nodes[] */
        void storeBSTNodes(Node root, Vector<Node> nodes) {
            // pada saat null
            if (root == null)
                return;

            // Store node di Inorder (yang diurutkan untuk BST)
            storeBSTNodes(root.left, nodes);

            nodes.add(root);

            storeBSTNodes(root.right, nodes);
        }

        /* Fungsi rekursif untuk membangun pohon biner*/
        Node buildTreeUtil(Vector<Node> nodes, int start, int end) {
            //  pada saat null
            if (start > end)
                return null;

            /* cara Dapatkan elemen tengah dan membuat akar
             */
            int mid = (start + end) / 2;

            Node node = nodes.get(mid);

            /* Menggunakan indeks di seluruh Inorder, konstruksi kiri dan kanan subtree
             */
            node.left = buildTreeUtil(nodes, start, mid - 1);

            node.right = buildTreeUtil(nodes, mid + 1, end);

            return node;
        }

        // Fungsi ini mengubah BST yang tidak balance menjadi balance BST
        Node buildTree(Node root) {

            //ini cara  menyimpan simpul yang diberikan BST

            Vector<Node> nodes = new Vector<Node>();

            storeBSTNodes(root, nodes);

            // membangun BST dari nodes[]

            int n = nodes.size();

            return buildTreeUtil(nodes, 0, n - 1);

        }

        /* Fungsi untuk melakukan preorder pohon */
        void preOrder(Node node) {
            if (node == null)
                return;
            System.out.print(node.data + " ");

            preOrder(node.left);

            preOrder(node.right);
        }

    }

    // program untuk menguji fungsi diatas

    public static void main(String[] args) {

         /* Constructed skewed binary tree is

                10

               /

              8

             /

            7

           /

          6

         /

        5

        */
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(10);

        tree.root.left = new Node(8);

        tree.root.left.left = new Node(7);

        tree.root.left.left.left = new Node(6);

        tree.root.left.left.left.left = new Node(5);


        tree.root = tree.buildTree(tree.root);

        System.out.println("Preorder traversal of balanced BST is :");

        tree.preOrder(tree.root);

    }
}

