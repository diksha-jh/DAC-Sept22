//7. How to check the given number is Positive or Negative in Java?

import java.util.Scanner;
class PositiveOrNegative
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a=sc.nextInt();
		if(a<0)
		{
			System.out.println("Number is negative");
		}
		else if(a==0)
		{
			System.out.println("Number is neither positive nor negative");
		}
		else
		{
			System.out.println("Number is positive");
		}
	}
}

/*

I:\Interview Collection>javac PositiveOrNegative.java

I:\Interview Collection>java PositiveOrNegative
Enter the number: 0
Number is neither positive nor negative

I:\Interview Collection>java PositiveOrNegative
Enter the number: 5
Number is positive

I:\Interview Collection>java PositiveOrNegative
Enter the number: -1
Number is negative

*/