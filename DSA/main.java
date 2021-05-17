package DSA;


public class main {
    public static void main(String [] args){

       BinaryTree tree = new BinaryTree();
       BinaryTree tree2 = new BinaryTree();

       tree.insert(50);
       tree.insert(70);
       tree.insert(1000);
       tree.insert(10);
       tree.insert(24);
       tree.insert(11);
       tree.insert(155);
       tree.insert(1111);
       tree.insert(1542);
       tree.insert(1);

       tree2.insert(50);
       tree2.insert(70);
       tree2.insert(1000);
       tree2.insert(10);
       tree2.insert(24);
       tree2.insert(11);
       tree2.insert(155);
       tree2.insert(1111);
       tree2.insert(1542);
       tree2.insert(1);


       System.out.println(tree.find(70));
       System.out.println(tree.find(1000));
       System.out.println(tree.find(1));

       tree.traversePreOrder();
       System.out.println();
       tree.traverseInOrder();
       System.out.println();

       System.out.println(tree.height());

       System.out.println(tree.minimum());

//       tree.insert(1);
//       System.out.println(tree.minimum());
//       tree.insert(5);
//       System.out.println(tree.minimum());

       System.out.println(tree.height());

       System.out.println(tree.equals(tree2));
    }
}
