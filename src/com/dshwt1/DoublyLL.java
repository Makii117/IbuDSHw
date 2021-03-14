package com.dshwt1;

import java.util.Iterator;

public class DoublyLL<Item> implements Iterable<Item> {

    Node<Item> head;
    Node<Item> tail;
    int size=0;

// mrsko mi pisat komentare, garant se necu mrzit sljedeci put kad ovo otvorim
// zali boze bodova

    //dodaje novi node na pocetak
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
    //dodaje novi node na kraj
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



    //brise node sa pocetka
    public void removeFromFront(){
        if(head==null){
            throw new IndexOutOfBoundsException("List is empty.");
        }
        head=head.next;
        size--;
    }
    //brise node sa kraja
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
    //vraca duzinu liste
    public int count(){
        return size;
    }

    public Iterator<Item> iterator(){
        return new DoublyLLIterator();
    }

    //iterator kroz listu
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
