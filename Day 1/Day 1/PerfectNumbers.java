//26. Write a Java Program to print Perfect Numbers between 1 to 1000.

import java.util.Scanner;
class PerfectNumbers
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the starting range number: ");
		int a=sc.nextInt();
		System.out.print("Enter the ending range number: ");
		int b=sc.nextInt();
		
		for(int i=a;i<=b;i++)
		{
			int sum=0;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
			}
			if(sum==i)
			{
				System.out.print(i+" ");
			}
		}
	}
}

/*

I:\Interview Collection>javac PerfectNumbers.java

I:\Interview Collection>java PerfectNumbers
Enter the starting range number: 1
Enter the ending range number: 1000
6 28 496

*/