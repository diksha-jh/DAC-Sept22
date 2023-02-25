//11. Write a Java Program to print all the Factors of the Given number.

import java.util.Scanner;
class Factors
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				System.out.print(i+" ");
			}
		}
	}
}

/*

I:\Interview Collection>javac Factors.java

I:\Interview Collection>JAVA Factors
Enter the number:
60
1 2 3 4 5 6 10 12 15 20 30 60

*/