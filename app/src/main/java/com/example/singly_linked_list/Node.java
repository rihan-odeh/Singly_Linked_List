package com.example.singly_linked_list;



public class Node {
    public int value;
    public Node next;

    public Node(int value){
        this.value= value;
        this.next= null;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setValue(int value) {
        this.value = value;
    }
}