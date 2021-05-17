package DSA;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class BinaryTree {

    public static class node {
        int value;
        node leftChild;
        node rightChild;

        public node(int value) {
            this.value = value;
        }
    }

    private node root;

    public void insert(int value) {
        if (root == null) {
            root = new node(value);
            return;
        }
        var current = root;
        while (true) {
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = new node(value);
                    return;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = new node(value);
                    return;
                }
                current = current.rightChild;
            }
        }

    }

    public boolean find(int value) {
        if (root == null) {
            return false;
        }

        var current = root;
        while (true) {
            if (current == null) {
                return false;
            } else if (current.value == value) {
                return true;
            }
            if (value < current.value) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
        }
    }

    public void traversePreOrder() {
        traversePreOrder(root);
    }

    private void traversePreOrder(node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    public void traverseInOrder() {
        traverseInOrder(root);
    }

    private void traverseInOrder(node root) {
        if (root == null) {
            return;
        }

        traverseInOrder(root.leftChild);
        System.out.print(root.value + " ");
        traverseInOrder(root.rightChild);
    }

    public int height() {
        return height(root);
    }

    private int height(node root) {
        if (root == null)
            return -1;

        if (root.leftChild == null && root.rightChild == null)
            return 0;

        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }

    public int minimum() {
        return minimum(root);
    }

    private int minimum(node root) {

        if (root.leftChild == null || root.rightChild == null)
            return root.value;

        var left = minimum(root.leftChild);
        var right = minimum(root.rightChild);
        return Math.min(Math.min(left, right), root.value);
    }

    public boolean equals(BinaryTree tree2) {
        return equals(root, tree2.root);
    }

    private boolean equals(node tree1, node tree2) {
        if (tree1 == null && tree2 == null)
            return true;

        if (tree1 != null && tree2 != null) {
            return tree1.value == tree2.value
                    && equals(tree1.leftChild, tree2.leftChild)
                    && equals(tree1.rightChild, tree2.rightChild);
        }

        return false;

    }

    public boolean isBinarySearchTree() {
        return isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBinarySearchTree(node root, int min, int max) {
        if (root == null)
            return true;

        if (root.value > max || root.value < min)
            return false;


        return isBinarySearchTree(root.leftChild, min, root.value) && isBinarySearchTree(root.rightChild, root.value, max);

    }

    public void swapRoot(){
        var temp = root;
        root = root.leftChild;
        root.leftChild = temp;
    }

    public void nodesAtDistance(int distance){
        var list = new ArrayList<Integer>();
        System.out.println(Arrays.toString(nodesAtDistance(root, distance, list).toArray()));
    }

    private ArrayList<Integer> nodesAtDistance(node root , int distance , ArrayList<Integer> list){
        if(root == null)
            return list;

        if(distance == 0 ){
            list.add(root.value);
            return list;
        }

        nodesAtDistance(root.leftChild , distance-1, list);
        nodesAtDistance(root.rightChild, distance-1, list);

        return list;
    }

}
