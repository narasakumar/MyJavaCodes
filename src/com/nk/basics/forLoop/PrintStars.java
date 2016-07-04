package com.nk.basics.forLoop;

public class PrintStars {

	public static void for1(int length, String s)
	{
		a:
			for(int i=1;i<=length;i++)
			{


				b:

					for(int j=1;j<=i;j++)
					{
						System.out.print(" "+s+" ");
					}
	System.out.println("");
			}		
	}


	public static void for2(int length, String s)
	{
		a:
			for(int i=1;i<=length;i++)
			{


				b:

					for(int j=length;j>=i;j--)
						//OR 
						//for(int j=1;j<=6-i;j++)
					{
						System.out.print(" "+s+" ");
					}
	System.out.println("");
			}		
	}

	public static void for3(int length, String s)
	{
		a:
			for(int i=1;i<=length;i++)
			{
				b:
					for(int j=length;j>=1;j--)
					{
						if(i < j)
							System.out.print(" ");
						else
							System.out.print(s);

					}
	System.out.println("");
			}		
	}

	public static void for5(int length, String s)
	{

		for (int i = 1; i <= length; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(" ");
			for (int j = i; j < length; j++)
				System.out.print(s);
			System.out.println();
		}
	}
	public static void for4(int length, String s)
	{
		a:
			for(int i=1;i<=length;i++)
			{
				b:
					for(int j=length;j>=1;j--)
					{
						if(i > j)
							System.out.print(" ");
						else
							System.out.print(s);

					}
	System.out.println("");
			}		
	}
	public static void forStringBuilder(int length, String s)
	{
		StringBuilder stars = new StringBuilder();

		for(int i = 1; i <= length; i++)
		{
			stars.append(s);
			System.out.println(stars);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//forStringBuilder(5,"*");
		//for1(5,"*");
		//for2(5,"*");
		//for3(5,"*");
		//for4(5,"*");
		for5(5,"*");

	}

}
