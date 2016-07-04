package com.nk.Code.fibonacciSeries;

import java.util.Scanner;

import javax.sound.sampled.ReverbType;

public class FibonacciWithRecursion {

	static int previousNo=0,currentNo=1,nextNo;

	private static void findFibonacci(int i) {
		// TODO Auto-generated method stub
		if(i>0)
		{
			nextNo=currentNo+previousNo;
			previousNo=currentNo;
			currentNo=nextNo;

			System.out.print(nextNo+", ");

			findFibonacci(i-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number");

		Scanner s=new Scanner(System.in);
		int i=s.nextInt();

		System.out.print(previousNo+", "+currentNo+", ");
		findFibonacci(i-2);

	}
}
