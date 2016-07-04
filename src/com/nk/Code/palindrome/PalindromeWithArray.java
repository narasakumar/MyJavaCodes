package com.nk.Code.palindrome;
import java.util.Scanner;

public class PalindromeWithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Number");

		int n=new Scanner(System.in).nextInt();
		int length=Integer.toString(n).length();
		int [] array=new int[length];

		for(int i=0;i<length;i++)
		{
			array[length-i-1]=n%10;
			n=n/10;
		}

		int arrayLength=array.length;

		for(int i=0;i<arrayLength;i++)
		{
			System.out.print(array[i]+", ");
		}

		//		if(arrayLength%2==0)
		//		{
		boolean flag=false;
		for(int i=0;i<arrayLength;i++)
		{
			if(array[i]==array[arrayLength-i-1])
			{
				flag=true;
			}
			else
				flag=false;
			
		}

		System.out.println();
		if(flag)
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not a Palindrome");
		//		}

	}

}
