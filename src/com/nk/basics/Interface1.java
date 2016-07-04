package com.nk.basics;

public interface Interface1 {

	int x=100;
	void run();
}

class Child1 implements Interface1
{
	public void run()
	{
		System.out.println("x="+x);
	}
	public static void main(String[] args)
	{
		Child1 c=new Child1();
		c.run();
		
		Class class1=c.getClass();
		System.out.println(class1.getName());
		System.out.println(c.getClass().getName());
	}
}
