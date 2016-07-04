package com.nk.poc;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");

		try
		{
			int n=new Scanner(System.in).nextInt();
			
			int reversedNo=0;
			//int r=0;
			while(n>0)
			{
				reversedNo=(n%10)+(reversedNo*10);
				
				n/=10;
			}
			System.out.println(reversedNo);
			
			

		}
		catch(Exception e)
		{
			System.out.println(e.getStackTrace());
		}
	}

}
