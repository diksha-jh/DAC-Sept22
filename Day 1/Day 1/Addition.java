//14. How to add two numbers without using the arithmetic operators in Java?

import java.util.Scanner;
class Addition
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a=sc.nextInt();
		System.out.println("Enter the second number: ");
		int b=sc.nextInt();
		add(a,b);
	}
	
	public static void add(int a,int b)
	{
		for(int i=1;i<=b;i++)
		{
			a++;
		}
		System.out.println("Addition is: "+a);
	}
}

/*

I:\Interview Collection>javac Addition.java

I:\Interview Collection>java Addition
Enter the first number:
36
Enter the second number:
45
Addition is: 81

*/