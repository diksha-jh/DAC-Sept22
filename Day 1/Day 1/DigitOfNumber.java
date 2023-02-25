//10. Write a Java Program to print the digits of a Given Number. 

import java.util.Scanner;
class DigitOfNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a=sc.nextInt();
		while(a!=0)
		{
			int i=a%10;
			a=a/10;
			System.out.print(i+" ");
		}	
	}
}

/*

I:\Interview Collection>javac DigitOfNumber.java

I:\Interview Collection>java DigitOfNumber
Enter the number:
2345
5 4 3 2

*/
