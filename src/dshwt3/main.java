package dshwt3;

public class main {
    public static void main(String[] args){
        linkedQueue<Integer> q = new linkedQueue<Integer>();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println("Size of q: "+ q.size());
    }
}
