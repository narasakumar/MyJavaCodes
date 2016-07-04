package com.nk.Code.palindrome;
import java.util.Scanner;

public class PalindromeReversingNumber {

	public static boolean checkPalindrome(int x)
	{
			int n=x;
			int originalNo=n;
			
			int reversedNo=0;
			//int r=0;
			while(n>0)
			{
				reversedNo=(n%10)+(reversedNo*10);
				
				n/=10;
			}
			System.out.println(reversedNo);
			
			if(originalNo==reversedNo)
			{
				return true;
			}
			else
			{
				return false;
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");

		int x=new Scanner(System.in).nextInt();
		
		if(checkPalindrome(x))
			{
				System.out.println("Palindrome");
			}
			else
			{
				System.out.println("Not a Palindrome");
			}
	}
}
