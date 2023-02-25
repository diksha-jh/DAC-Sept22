//5. Swap two numberswithout using third variable approach 2. 

import java.util.Scanner;
class SwapNumber2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a=sc.nextInt();
		System.out.print("Enter the second number: ");
		int b=sc.nextInt();
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After Swapping first number: "+a);
		System.out.println("After Swapping second number: "+b);
	}
}

/*

I:\Interview Collection>javac SwapNumber2.java

I:\Interview Collection>java SwapNumber2
Enter the first number: 58
Enter the second number: 12
After Swapping first number: 12
After Swapping second number: 58

*/
