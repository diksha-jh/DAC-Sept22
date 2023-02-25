//13. Write a Java Program to find the smallest of 3 numbers(a,b,c) without using < or > symbol? 

import java.util.Scanner;
class SmallestNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first no: ");
		int a=sc.nextInt();
		System.out.println("Enter the second no: ");
		int b=sc.nextInt();
		System.out.println("Enter the third no: ");
		int c=sc.nextInt();
		System.out.println("Minimum of 3 numbers is: "+small(a,b,c));
	}
	public static int small(int a,int b,int c)
	{
		int d=0;
		while(a!=0 && b!=0 && c!=0)
		{
			a--;
			b--;
			c--;
			d++;
		}
		return d;
	}		
}

/*

I:\Interview Collection>javac SmallestNumber.java

I:\Interview Collection>java SmallestNumber
Enter the first no:
5
Enter the second no:
6
Enter the third no:
7
Minimum of 3 numbers is: 5

*/