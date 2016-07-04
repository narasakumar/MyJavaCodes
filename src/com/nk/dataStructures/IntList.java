package com.nk.dataStructures;

public class IntList{

	 public int head;
	 public IntList tail;


	 public IntList(int h,IntList t){
	  this.head = h;
	  this.tail = t;
	 }

	 public int size(){
	  if (this.tail == null)
	   return 1;
	  int personFrontOfMe = this.tail.size();
	  return personFrontOfMe+1;
	 }

	 public int iterativeSize(){
	  
	  IntList p = this;
	  int size = 0;
	  while(p!=null)
	  {
	   size= size +1;
	   p = p.tail;
	  }
	  return size;

	 }

	 public int get(int i){

	  if (i == 0)
	   return this.head;
	  return this.tail.get(i-1);

	 }

	 public static IntList incrList(IntList L, int x)
	 {
	  if (L == null)
	   return null;
	  int newHead = L.head + x;
	  IntList newTail = incrList(L.tail,x);
	  return new IntList(newHead,newTail);
	 }

	 public String toString()
	 {
	  if (this.tail==null)
	   return Integer.toString(head);
	  return Integer.toString(head)+" "+tail.toString();
	 }
	//Assuming the ith element actually exists
	 public int iterativeGet(int i){

	  IntList p = this;
	  int size = 0;

	  while(size != i)
	  {
	   size= size +1;
	   p = p.tail;
	  }
	  return p.head;

	 }

//	 public static IntList decrList(IntList L, int y){
//	  if(L == null)
//	   return null;
//	  int newHead = L.head - x;
//	  IntList newTail = decrList(L.tail,x);
//	  return new IntList(newHead,newTail);
//	 }

	 public static void main(String[] args)
	 {
	  IntList L= new IntList(100,null);
	  L.tail = new IntList(152,null);

	  System.out.println(incrList(L,0));
	  //L.tail.tail = new IntList(20,null);
	  //System.out.println(L.head);
	  //System.out.println(L.tail.head);
	  //System.out.println(L.tail.tail.tail.head);
	  //System.out.println(L.size());
	  ///System.out.println(L.iterativeSize());
	  //System.out.println(L.get(1));
	  //System.out.println(L.iterativeGet(0));

	 }
	}