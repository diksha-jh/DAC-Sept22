//22. Write a Java Program to print Prime Numbers from 1 to N. 

import java.util.Scanner;
class PrimeNumbers
{
	public static void main(String args[])
	{
		int j;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n=sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			int temp=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					temp=temp+1;
				}
			}
			if(temp==2)
			{
				System.out.print(i+" ");
			}
		}
	}
}

/*

I:\Interview Collection>javac PrimeNumbers.java

I:\Interview Collection>java PrimeNumbers
Enter the value of n
20
Prime numbers are:2 3 5 7 11 13 17 19

*/