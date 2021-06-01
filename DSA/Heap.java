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

    public void removeTop(){
        heapTree.set(0, heapTree.get(--size));
        int index = 0;
        while(index<=((size/2)-1)  && isSmallerThanChild(index) ){
            int largerChildIndex = heapTree.indexOf(greaterChild(index));
            swap(index, largerChildIndex);
            index = largerChildIndex;
        }
    }
    private int greaterChild(int index){
        return (Math.max(getRightChild(index), getLeftChild(index)));
    }

    private boolean isSmallerThanChild(int index){
        return getLeftChild(index)>heapTree.get(index) || getRightChild(index) > heapTree.get(index);
    }

    private int getLeftChild(int index){
        return heapTree.get(index*2+1);
    }

    private int getRightChild(int index){
        return heapTree.get(index*2+2);
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
