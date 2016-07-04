package com.nk.Code.armstrongNumber;
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number to check if its armstrong number");
		
		int n=new Scanner(System.in).nextInt();
		int originalNo=n;
		//boolean flag=false;
		int x=0;
		
		while(n>0)
		{
			x+=Math.pow((n%10),3);
			n/=10;
		}
		
		if(x==originalNo)
		{
			System.out.println(originalNo+ " is ArmStrong Number");
		}
		else
		{
			System.out.println(originalNo+ " is Not an ArmStrong Number");
		}

		
	}

}
