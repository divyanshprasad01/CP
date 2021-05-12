package DSA;

import java.util.NoSuchElementException;

public class LinkedLists {
    Node head;
    Node tail;
    int size =0;

    public boolean isEmpty(){
        if(head == null && tail==null)
            System.out.println("The list is empty");
        else
            System.out.println("The list is not empty");
        return head == null && tail==null;
    }

    public void addLast(int value){
        var node = new Node(value);
        if(head==null)
            head = tail = node;
        else{
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void addFirst(int value){
        var node = new Node(value);
        if(head == null)
            head = tail = node;
        else{
            node.next = head;
            head = node;
        }
        size++;
    }

    public Node deleteFirst(){
        if(isEmpty())
            throw new NoSuchElementException();

        if(head == tail){
            head = tail = null;
            size--;
            return null;
        }else{
            var second = head.next;
            head.next = null;
            head = second;
            size--;
            return head;
        }
    }

    public Node deleteLast(){
        if(isEmpty())
            throw new NoSuchElementException();

        if(head == tail){
            head = tail =null;
            size--;
            return null;
        }

        tail = getPrevious(tail);
        tail.next = null;
        size--;
        return tail;
    }

    public Node getPrevious(Node node){
        if(head==tail){
            return null;
        }
        var current = head;
        while(current != null){
            if(current.next == tail){
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public int[] toArray(){
        int[] array = new int[size];
        Node node = head;
        for(int i=0; i<size; i++){
            array[i] = node.value;
            node = node.next;
        }
        return array;
    }

    public int getSize(){
        return size;
    }

    public void reverseList(){
        if(head==null&&tail==null)
            throw new IllegalStateException();
        var previous = head;
        var current = head.next;
        tail = head;
        while(current != null) {
            var temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        head = previous;
        tail.next = null;
    }


    private static class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
