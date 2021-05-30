package DSA;

public class AvlTree {
    private node root;

    public void insert(int value) {
        root = insert(root, value);
    }

    private node insert(node root, int value) {
        if (root == null)
            return new node(value);

        if (value < root.value)
            root.leftChild = insert(root.leftChild, value);
        else
            root.rightChild = insert(root.rightChild, value);

        setHeight(root);

        return balance(root);
    }

    private int setHeight(node root) {
        return root.height = Math.max(height(root.leftChild), height(root.rightChild)) + 1;
    }

    private int height(node root) {
        return (root == null) ? -1 : root.height;
    }

    private int balanceFactor(node leftChild, node rightChild) {
        return height(leftChild) - height(rightChild);
    }

    private boolean isLeftHeavy(node root) {
        return balanceFactor(root.leftChild, root.rightChild) > 1;
    }

    private boolean isRightHeavy(node root) {
        return balanceFactor(root.leftChild, root.rightChild) < -1;
    }

    private node balance(node root) {
        node newRoot = root;
        if (isRightHeavy(root)) {
            if (height(root.rightChild.rightChild) > height(root.rightChild.leftChild)) {
                newRoot = LeftRotate(root);
            } else {
                newRoot.rightChild = RightRotate(root.rightChild);
                newRoot = LeftRotate(root);
            }
            System.out.println("The tree is balanced");
        } else if (isLeftHeavy(root)) {

            if (height(root.leftChild.leftChild) > height(root.leftChild.rightChild)) {
                newRoot = RightRotate(root);
            } else {
                newRoot.leftChild = LeftRotate(root.leftChild);
                newRoot = RightRotate(root);
            }
            System.out.println("The tree is balanced");
        }


        return newRoot;
    }

    private node LeftRotate(node root) {
        node newRoot = root.rightChild;
        root.rightChild = newRoot.leftChild;
        newRoot.leftChild = root;
        setHeight(root);
        setHeight(newRoot);
        return newRoot;
    }

    private node RightRotate(node root) {
        node newRoot = root.leftChild;
        root.leftChild = newRoot.rightChild;
        newRoot.rightChild = root;
        setHeight(root);
        setHeight(newRoot);
        return newRoot;
    }

    private class node {
        int height;
        int value;
        node leftChild;
        node rightChild;

        public node(int value) {
            this.value = value;
        }
    }

}
