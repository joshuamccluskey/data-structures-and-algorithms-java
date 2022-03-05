package datastructures.tree;

import java.util.ArrayList;
import datastructures.tree.Node;

public class BinaryTree
{
    ArrayList<Integer> elementsPre = new ArrayList<>();
    ArrayList<Integer> elementsIn = new ArrayList<>();
    ArrayList<Integer> elementsPost = new ArrayList<>();

    public ArrayList<Integer> preOrderTraversal(Node root)
    {
        if (root == null){
            return elementsPre;
        }
        elementsPre.add(root.value);
        preOrderTraversal(root.leftNode);
        preOrderTraversal(root.rightNode);
        System.out.println(elementsPre);
        return elementsPre;
    }

    public ArrayList<Integer> inOrderTraversal(Node root)
    {
        if (root == null){
            return elementsPre;
        }

        preOrderTraversal(root.leftNode);
        elementsPre.add(root.value);
        preOrderTraversal(root.rightNode);
        System.out.println(elementsPre);
        return elementsIn;
    }

    public ArrayList<Integer> postOrderTraversal(Node root)
    {
        if (root == null){
            return elementsPre;
        }

        preOrderTraversal(root.leftNode);
        preOrderTraversal(root.rightNode);
        elementsPre.add(root.value);
        System.out.println(elementsPre);
        return elementsIn;
    }
}