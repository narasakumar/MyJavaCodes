package com.nk.dataStructures;

public class LinkedList {
	int head;
	LinkedList tail;


	public LinkedList(int head,LinkedList tail)
	{
		this.head = head;
		this.tail = tail;
	}
	
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList(6, null);
		list.tail = new LinkedList(7, null);
	}

}
