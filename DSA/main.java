package DSA;

import java.lang.reflect.Array;
import java.util.Arrays;

public class main {
    public static void main(String [] args){

        var node = new LinkedLists();

        node.isEmpty();
//        node.deleteFirst();
        node.addFirst(50);
        node.addLast(60);
        node.addLast(70);
        node.addLast(80);
        node.addLast(90);
        node.addLast(100);
        System.out.println(Arrays.toString(node.toArray()));
        node.isEmpty();
//        node.deleteFirst();
        node.reverseList();
        System.out.println(Arrays.toString(node.toArray()));


    }
}
