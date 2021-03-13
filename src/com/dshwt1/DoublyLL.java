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
        if(head==null){
            head=newNode;
        }
        else {
            Node<Item> current=head;
            while(current.next != null){
                current=current.next;
            }
            current.next=newNode;
        }
        size++;
    }
    public void addAfter(Node<Item> oldNode,Item item){
        Node<Item> newNode = new Node<Item>();
        newNode.data=item;

        newNode.next=oldNode.next;
        oldNode.next=newNode;
        newNode.prev=oldNode;
        if(newNode.next!=null){
            newNode.next.prev=newNode;
        }
    }

    public void addBefore(Node<Item> oldNode, Item item){
    Node<Item> newNode = new Node<Item>();
    newNode.data=item;
        if(newNode.prev == null){

        }
    }



    public void removeFromFront(){
        if(head==null){
            throw new IndexOutOfBoundsException("LL is empty.");
        }
        head=head.next;
        size--;
    }

    public void removeFromRear(){

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

        }

    }
}
