//4.Swap two numberswithout using third variable approach 1.

import java.util.Scanner;
class SwapNumber1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the First number: ");
		int a=sc.nextInt();
		System.out.print("Enter the Second number: ");
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping first number: "+a);
		System.out.println("After swapping second number: "+b);
	}		
}

/*

I:\Interview Collection>javac SwapNumber1.java

I:\Interview Collection>java SwapNumber1
Enter the First number: 52
Enter the Second number: 36
After swapping first number: 36
After swapping second number: 52

*/