//15. Write a java program to Reverse a given number.

import java.util.Scanner;
class ReverseNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a=sc.nextInt();
		while(a!=0)
		{
			int i=a%10;
			a=a/10;
			System.out.print(i+" ");
		}
	}
}

/*

I:\Interview Collection>javac ReverseNumber.java

I:\Interview Collection>java ReverseNumber
Enter the number:
4569
9 6 5 4

*/