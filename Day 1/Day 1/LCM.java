//17. Write a java program to LCM of TWO given number. 

import java.util.Scanner;
class LCM
{
	public static void main(String args[])
	{
		int gcd=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a=sc.nextInt();
		System.out.println("Enter the second number: ");
		int b=sc.nextInt();
		for(int i=1;i<=a && i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			gcd=i;
		}
		int lcm=a*b/gcd;
		System.out.println("LCM of " +a+ " and " +b+ " is: "+lcm);
	}
}

/*

I:\Interview Collection>javac LCM.java

I:\Interview Collection>java LCM
Enter the first number:
4
Enter the second number:
12
LCM of 4 and 12 is: 12

*/
