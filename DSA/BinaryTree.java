package DSA;

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

        return 1+ Math.max(height(root.leftChild), height(root.rightChild));
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

    public boolean equals(BinaryTree tree2){
        return equals(root, tree2.root);
    }

    private boolean equals(node tree1, node tree2){
        if(tree1 == null && tree2 == null)
            return true;

        if(tree1!=null && tree2!=null){
            return tree1.value == tree2.value
                    && equals(tree1.leftChild,tree2.leftChild)
                    && equals(tree1.rightChild, tree2.rightChild);
        }

        return false;

       }


}
