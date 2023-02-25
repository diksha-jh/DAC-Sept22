//3. Find the Factorial of a number using Recursion. 

import java.util.Scanner;
class FactorialRecursion
{
	public static int fact(int a)
	{
		if(a==0)
		{
			return 1;
		}
		else
		{
			return(a*fact(a-1));
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a=sc.nextInt();
		System.out.println("Factorial of "+a+ " is: "+fact(a));
	}
}

/*

I:\Interview Collection>javac FactorialRecursion.java

I:\Interview Collection>java FactorialRecursion
Enter the number: 5
Factorial of 5 is: 120

*/