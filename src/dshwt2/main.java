package dshwt2;

public class main {
    public static void main(String[] args) {
        resizingStack<Integer> s = new resizingStack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.push(5);
        System.out.println("Stack size: "+s.size());
    }
}
