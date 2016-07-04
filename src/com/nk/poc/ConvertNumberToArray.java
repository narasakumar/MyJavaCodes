package com.nk.poc;
import java.util.Scanner;

public class ConvertNumberToArray {

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


	}

}
