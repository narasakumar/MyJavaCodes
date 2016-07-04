package com.nk.Code.factorial;
import java.util.Scanner;

public class Factorial {

	public static long findFactorial(long x)
	{
		if(x>0)
		{
		long result=1;
	
		return x*findFactorial(x-1);
		}
		else
		{
			return 1;	
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number");
		int n=new Scanner(System.in).nextInt();
		
		System.out.println(findFactorial(n));
	}
}
