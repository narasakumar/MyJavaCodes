package com.nk.dataStructures;
import java.util.Scanner;


public class BubbleSort {

	static int forLoopIterator=0;
	
	private static void bubbleSort(int[] array1) {
		// TODO Auto-generated method stub
		
		int temp=0;
		int length=array1.length;
		for (int x=0;x<length-1;x++)
		{
			for (int i=0;i<length-1;i++)
			{	
//				forLoopIterator++;
//				System.out.println(forLoopIterator);
			if(array1[i]>array1[i+1])
			{
				temp=array1[i];
				array1[i]=array1[i+1];
				array1[i+1]=temp;
			}
			}
		}
		
		System.out.println("After bubble sorting the elements are");
		for(int i:array1)
		{
			System.out.print(i+" ");
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter number of elements");
		
		Scanner scanner1=new Scanner(System.in);
		int n=scanner1.nextInt();
		System.out.println("Enter "+n+" elements");
		
		int [] array1=new int[n];
		for (int i=0;i<n;i++)
		{
			array1[i]=scanner1.nextInt();
		}
		
		System.out.println("Before bubble sorting the elements are");
		for(int i:array1)
			//for(int i=0;i<n;i++)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		bubbleSort(array1);
		
	}

	

}
