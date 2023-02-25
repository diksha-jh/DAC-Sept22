//8. Write a Java Program to find whether given number is Leap year or NOT? 

import java.util.Scanner;
class LeapOrNot
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a=sc.nextInt();
		if(a%100==0)
		{
			if(a%400==0)
			{
				System.out.println("Leap Year");
			}
			else
			{
				System.out.println("Not leap year");
			}
		}
		else if(a%4==0)
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not Leap Year");
		}
	}
}

/*

I:\Interview Collection>javac LeapOrNot.java

I:\Interview Collection>java LeapOrNot
Enter the number: 2023
Not Leap Year

I:\Interview Collection>java LeapOrNot
Enter the number: 1900
Not leap year

I:\Interview Collection>java LeapOrNot
Enter the number: 1600
Leap Year

I:\Interview Collection>java LeapOrNot
Enter the number: 2024
Leap year

*/