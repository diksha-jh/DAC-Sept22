//1. Check the given number is EVEN or ODD.

import java.util.Scanner;
class EvenOdd
{
	public static void main(String args[])
	{
		System.out.print("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("No is even");
		}
		else
		{
			System.out.println("No is Odd");
		}
	}
}

/*

I:\Interview Collection>javac EvenOdd.java

I:\Interview Collection>java EvenOdd
Enter the number:6
No is even

I:\Interview Collection>java EvenOdd
Enter the number:5
No is Odd

*/