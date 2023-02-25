//23. Write a Java Program to check whether the given number is Armstrong Number or NOT.

import java.util.Scanner;    
public class ArmstsrongNumber  
{  
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		int t1=n;
		int length=0;
		while(t1!=0)
		{
			t1=t1/10;
			length=length+1;
		}
		
		int t2=n,rem;
		int arm=0;
		while(t2!=0)
		{
			rem=t2%10;
			int mul=1;
			for(int i=1;i<=length;i++)
			{
				mul=mul*rem;
			}
			arm=arm+mul;
			t2=t2/10;
		}
		if(n==arm)
		{
			System.out.println("Number is armstrong");
		}
		else
		{
			System.out.println("Number is not armstrong");
		}
	}
}

/*

I:\Interview Collection>javac ArmstsrongNumber.java

I:\Interview Collection>java ArmstsrongNumber
Enter the number: 5
Number is armstrong

I:\Interview Collection>java ArmstsrongNumber
Enter the number: 153
Number is armstrong

I:\Interview Collection>java ArmstsrongNumber
Enter the number: 152
Number is not armstrong

*/