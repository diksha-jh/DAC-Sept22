//2. Write a Java Program to find the Factorial of given number. 

import java.util.Scanner;
class Factorial
{
	public static void main(String args[])
	{
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.print("Fact of "+a+ " is: "+fact);
	}
}

/*

I:\Interview Collection>javac Factorial.java

I:\Interview Collection>java Factorial
Enter the number: 5
Fact of 5 is: 120

*/
