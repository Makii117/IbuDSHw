package com.dshwt1;

public class Main {

    public static void main(String[] args) {
	DoublyLL<Integer> list = new DoublyLL<Integer>();


	list.addToRear(1);
	list.addToRear(3);
	list.addToFront(4);
	for(int i: list){
        System.out.println(i);
    }
		System.out.println("---------");
	list.removeFromRear();
	list.addToFront(7);
		for(int i: list){
			System.out.println(i);
		}

    list.removeFromFront();
	list.addToRear(6);
    }


}
