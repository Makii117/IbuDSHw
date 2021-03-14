package dshwt3;

public class linkedQueue<Item> {
    private Node<Item> head;
    private Node<Item> tail;
    int len=0;

    //stavlja node u q
    public void enqueue(Item item){
        Node<Item> oldTail=tail;
        tail=new Node<Item>();
        tail.data=item;
        tail.next=null;
        if(isEmpty()){
            head=tail;

        }
        else{
            oldTail.next=tail;

        }
        len++;
    }
    //izbaca node iz q
    public Item dequeue(){
        Item item=head.data;
        head=head.next;
        if(isEmpty()){
            tail=null;

        }
        len--;
        return item;
    }

    public boolean isEmpty(){
        return len==0;
    }

    public int size(){
        return len;
    }

}
