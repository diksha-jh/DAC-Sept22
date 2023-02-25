//6. Swap two numberswithout using third variable approach 3. 

import java.util.Scanner;
class SwapNumber3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a=sc.nextInt();
		System.out.print("Enter the second number: ");
		int b=sc.nextInt();
		a=a*b/(b=a);
		System.out.println("After Swapping first number: "+a);
		System.out.println("After Swapping second number: "+b);
	}
}

/*

I:\Interview Collection>javac SwapNumber3.java

I:\Interview Collection>java SwapNumber3
Enter the first number: 45
Enter the second number: 78
After Swapping first number: 78
After Swapping second number: 45

*/