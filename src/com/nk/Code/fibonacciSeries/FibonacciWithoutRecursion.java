package com.nk.Code.fibonacciSeries;

import java.util.Scanner;

import javax.sound.sampled.ReverbType;

public class FibonacciWithoutRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number till fibonacci series to be generated");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Generating the fibonacci series....");

		try
		{
			int n=scanner.nextInt();
			int previousNumber=0;
			int currentNumber=1;
			int nextNumber;

			System.out.print(previousNumber+", ");
			
			System.out.print(currentNumber+", ");
			
			
			for (int i=2;i<n;i++)
			{
				
				
				nextNumber=currentNumber+previousNumber;
				
				System.out.print(nextNumber+", ");
				
				previousNumber=currentNumber;
				currentNumber=nextNumber;
				
				
				
				
				
			}

		}
		catch(Exception e)
		{
			System.out.println(e.getStackTrace());
		}

	}

}
