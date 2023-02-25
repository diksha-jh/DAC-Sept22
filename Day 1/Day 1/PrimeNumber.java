//21. Write a Java Program to check whether the Given Number is Prime Number or NOT. 

import java.util.Scanner;
class PrimeNumber
{
	public static void main(String args[])
	{
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a=sc.nextInt();
		
		for(int i=2;i<=a-1;i++)
		{
			if(a%i==0)
			{
				temp=temp+1;
			}
		}
		
		if(temp>0)
		{
			System.out.print(a+" is not prime");
		}
		else
		{
			System.out.print(a+ " is prime");
		}
	}
}

/*

I:\Interview Collection>javac PrimeNumber.java

I:\Interview Collection>java PrimeNumber
Enter the number: 11
11 is prime
I:\Interview Collection>java PrimeNumber
Enter the number: 4
4 is not prime

*/