package com.nk.basics;

class Parent {

	int x=100;

	void run()
	{
		System.out.println("x= "+x);
	}
	static void run1()
	{
		System.out.println("Static Parent run1()");
	}
	void test1()
	{
		System.out.println("Parent");
	}

}
class Child extends Parent{
	int x=500;

	void run()
	{
		System.out.println("x= "+x);
	}
	static void run1()
	{
		System.out.println("Static Child run1()");
	}
	void test2()
	{
		System.out.println("Child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Child();
		p.run();
		p.run1();
		Child.run1();
		System.out.println("p.x="+p.x);
		p.test1();
		//p.test2();
		
	}
}


