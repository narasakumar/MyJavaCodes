package com.nk.basics;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// catch/ finally is necessary for a try block
		
		try
		{
			int i=45/0;
			
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Catch block invocation");
			System.out.println("Divide by Zero error");
		}
		catch(Exception e)
		{
			System.out.println("Some error occurred");
		}
		finally
		{
			System.out.println("Finally block invocation");
		}
		System.out.println("Rest of the code..");
		
		//System.exit(0);
		//Array
		try{  
		    int a[]=new int[5];  
		    a[6]=30/0;  
		   }  
		   catch(ArithmeticException e){System.out.println("ArithmeticException");}  
		   catch(ArrayIndexOutOfBoundsException e){System.out.println("ArrayIndexOutOfBoundsException");}  
		   catch(Exception e){System.out.println("Exception");}  
		  
		   System.out.println("rest of the code...");
		   
		   
		   //ordering of catch blocks
		   
		   try{  
			    int a[]=new int[5];  
			    a[5]=30/0;  
			   }  
			   catch(Exception e){System.out.println("common task completed");}  
			 /*  catch(ArithmeticException e){System.out.println("task1 is completed");}  
			   catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}*/  
			   System.out.println("rest of the code...");  

	}

}
