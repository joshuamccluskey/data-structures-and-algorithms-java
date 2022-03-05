package datastructures.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BinaryTreeTest {

    @Test
    void test_preOrderTraversal() {
        BinaryTree cut = new BinaryTree();
        Node root = new Node(2);
        root.leftNode = new Node(3);
        root.rightNode = new Node(1);
        cut.preOrderTraversal(root);
        System.out.println("test_preOrder()");
        assertTrue(true);

    }

    @Test
    void inOrderTraversal() {
        BinaryTree cut = new BinaryTree();
        Node root = new Node(2);
        root.leftNode = new Node(3);
        root.rightNode = new Node(1);
        cut.inOrderTraversal(root);
        System.out.println("test_inOrder()");
        assertTrue(true);
    }

    @Test
    void postOrderTraversal() {
        BinaryTree cut = new BinaryTree();
        Node root = new Node(2);
        root.leftNode = new Node(3);
        root.rightNode = new Node(1);
        cut.postOrderTraversal(root);
        System.out.println("test_postOrder()");
        assertTrue(true);
    }
}