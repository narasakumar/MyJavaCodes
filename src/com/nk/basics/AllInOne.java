package com.nk.basics;

public class AllInOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArithmeticException a=new ArithmeticException("Test");
		
		for(int i=0;i<100;i++)
		{
			try{
			throw a;
			}
			catch(ArithmeticException ae){
				System.out.println(i+": Caught Exception. Details are "+ ae);
			}
		}
	}

}
