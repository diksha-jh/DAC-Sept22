//20. Write a Java Program to print all the Prime Factors of the Given Number. 

import java.util.Scanner;
class PrimeFactors
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a=sc.nextInt();
		for(int i=2;i<=a;i++)
		{
			while(a%i==0)
			{
				System.out.print(i+" ");
				a=a/i;
			}
		}
	}
}

/*

I:\Interview Collection>javac PrimeFactors.java

I:\Interview Collection>java PrimeFactors
Enter the number: 30
2 3 5

*/
