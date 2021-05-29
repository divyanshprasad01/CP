package DSA;

public class AvlTree {
    private class node{
        int height;
        int value;
        node leftChild;
        node rightChild;

        public node(int value) {
            this.value = value;
        }
    }
    private node root;

    public void insert(int value){
        root = insert(root,value);
    }

    private node insert(node root, int value){
        if(root == null)
            return new node(value);

        if(value < root.value)
            root.leftChild = insert(root.leftChild , value);
        else
            root.rightChild = insert(root.rightChild , value);

        root.height = Math.max(height(root.leftChild) , height(root.rightChild)) +1;

        balance(root);
        return root;
    }

    private int height(node root){
        return (root == null)? -1 : root.height;
    }

    private int balanceFactor(node leftChild , node rightChild){
        return height(leftChild)- height(rightChild);
    }

    private boolean isLeftHeavy(node root){
        return balanceFactor(root.leftChild, root.rightChild) > 1;
    }
    private boolean isRightHeavy(node root){
        return balanceFactor(root.leftChild, root.rightChild) < -1;
    }

    private void balance(node root){
        if(isRightHeavy(root)) {
            System.out.println("The tree is right Heavy");
        } else if(isLeftHeavy(root)) {
            System.out.println("The tree is left Heavy");
        }
        else
            System.out.println("The tree is balanced");

    }

}
