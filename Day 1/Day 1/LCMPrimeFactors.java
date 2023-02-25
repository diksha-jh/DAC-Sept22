//18. Write a java program to LCM of TWO given number using Prime Factors method. 

import java.util.Scanner;
class LCMPrimeFactors
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a=sc.nextInt();
		System.out.println("Enter the second number: ");
		int b=sc.nextInt();
		int i;
		
		int x=(a>b) ? a:b;
		for(i=x;i<=a*b;i=i+x)
		{
			if(i%a==0 && i%b==0)
			break;
		}
		System.out.println("LCM is: "+i);
	}
}

/*

I:\Interview Collection>javac LCMPrimeFactors.java

I:\Interview Collection>java LCMPrimeFactors
Enter the first number:
4
Enter the second number:
9
LCM is: 36

*/