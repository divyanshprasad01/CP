package DSA;

import java.util.ArrayList;

public class Heap {
    ArrayList<Integer> heapTree = new ArrayList<>();
    int size = 0;
    public void insert(int data){
        heapTree.add(data);
        size++;
        int indexData = heapTree.indexOf(data);
        int parentIndex = getParentIndexOf(data);

        while(heapTree.get(parentIndex) < heapTree.get(indexData)){
            swap(indexData , parentIndex);
            indexData = heapTree.indexOf(data);
            parentIndex = getParentIndexOf(data);
        }
    }

    private int getParentIndexOf(int data){
        return (heapTree.indexOf(data) - 1)/2;
    }

    private void swap(int index , int indexParent){
        int temp = heapTree.get(index);
        heapTree.set(index , heapTree.get(indexParent));
        heapTree.set(indexParent , temp);
    }
}
