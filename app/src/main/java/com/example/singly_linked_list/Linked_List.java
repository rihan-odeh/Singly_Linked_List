package com.example.singly_linked_list;

public class Linked_List {
    private Node head;
    String values;

    public Linked_List(){
        this.head= null;
    }
    public void add(int value){

        Node newNode = new Node(value);
            if(head == null) {
                head = newNode;
            } else {
                Node current = head;
                while(current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
    }
    public void remove(){
        Node previous = head;
        Node current = previous.next;
        while(current.next!= null){
            previous = previous.next;
            current = current.next;

        }
        current = null;
        previous.next = null;



    }
    public String printValues(){
        values =" ";
        Node current = head;
        while(current != null){
            values += current.value + " \n";
            current = current.next;

        }
return values;
    }

}
