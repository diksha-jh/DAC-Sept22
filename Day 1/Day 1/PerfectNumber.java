//25. Write a Java Program to check whether the given number is Perfect Number or NOT. 

import java.util.Scanner;
class PerfectNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a=sc.nextInt();
		int sum=0;
		for(int i=1;i<a;i++)
		{
			if(a%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==a)
		{
			System.out.print("Perfect Number");
		}
		else
		{
			System.out.print("Not a Perfect Number");
		}
		
	}
}

/*

I:\Interview Collection>javac PerfectNumber.java

I:\Interview Collection>java PerfectNumber
Enter the number: 6
Perfect Number
I:\Interview Collection>java PerfectNumber
Enter the number: 10
Not a Perfect Number

*/