package com.dshwt1;

import java.util.Iterator;

public class DoublyLL<Item> implements Iterable<Item> {

    Node<Item> head;
    Node<Item> tail;
    int size=0;



    public void addToFront(Item item){
        Node<Item> newNode = new Node<Item>();
        newNode.data=item;
        newNode.next=head;
        newNode.prev=null;
        if(head != null){
            head.prev=newNode;
        }
        head=newNode;
        size++;
    }

    public void addToRear(Item item){
        Node<Item> newNode=new Node<Item>();
        newNode.data=item;
        newNode.next=null;

        if(head==null){
            head=tail=newNode;
            head.prev=tail.next=null;
        }
        else {
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
        tail.next=null;
        }
        size++;
    }




    public void removeFromFront(){
        if(head==null){
            throw new IndexOutOfBoundsException("List is empty.");
        }
        head=head.next;
        size--;
    }

    public void removeFromRear(){
    if(head==null){
        throw new IndexOutOfBoundsException("List is empty");
        }
    else{
        if(head!=tail){
            tail=tail.prev;
            tail.next= null;
        }
        else {
            head=tail=null;
        }
        }
    size--;
    }

    public int count(){
        return size;
    }

    public Iterator<Item> iterator(){
        return new DoublyLLIterator();
    }


    private class DoublyLLIterator implements Iterator<Item>{
        Node<Item> current=head;
        public boolean hasNext(){
            return current != null;
        }
        public Item next(){
        Item item= current.data;
        current=current.next;
        return item;
        }

    }
}
