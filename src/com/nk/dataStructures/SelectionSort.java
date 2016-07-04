package com.nk.dataStructures;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter number of elements");
		Scanner scanner=new Scanner(System.in);

		int number=scanner.nextInt();
		System.out.println("Enter "+number+" elements");

		int[] array1=new int[number];
		for(int i=0;i<number;i++)
		{
			array1[i]=scanner.nextInt();
		}
		
		System.out.println("The numbers before selection sort are");
		for(int a:array1)
		{
		System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("After selection sort process, the elements are");
		
		selectionSort(array1);
		
		for(int a:array1)
		{
			System.out.print(a+" ");
		}
	}
	public static void selectionSort(int[] array1)
	{
		int length=array1.length;
		int min;
		int temp;
		
		for(int i=0;i<length-1;i++)
		{
			min=i;
			for(int j=i+1;j<length;j++)
			{
				if(array1[j]<array1[min])
				{
					min=j;
				}
				
			}
			if(i!=min)
			{
				temp=array1[min];
				array1[min]=array1[i];
				array1[i]=temp;
			}
			
		}
		
	}

}
