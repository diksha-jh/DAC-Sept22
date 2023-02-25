//16. Write a Java Program to find GCD of two given numbers.

import java.util.Scanner;
class GCD
{
	public static void main(String args[])
	{
		int gcd=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a=sc.nextInt();
		System.out.println("Enter the second number: ");
		int b=sc.nextInt();
		for(int i=1;i<=a && i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			gcd=i;
		}
		System.out.println("GCD of " +a+ " and " +b+ " is: " +gcd); 
	}
}

/*

I:\Interview Collection>javac GCD.java

I:\Interview Collection>java GCD
Enter the number:
12
Enter the second number:
24
GCD of 12 and 24 is: 12

*/