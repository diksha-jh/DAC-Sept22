//12. Write a Java Program to find sum of the digits of a given number.

import java.util.Scanner;
class SumOfDigit
{
	public static void main(String args[])
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a=sc.nextInt();
		while(a!=0)
		{
			int i=a%10;
			a=a/10;
			sum=sum+i;
		}
		System.out.println("Sum of digit is: "+sum);
	}
}

/*

I:\Interview Collection>java SumOfDigit
Enter the number:
65478
Sum of digit is: 30

*/