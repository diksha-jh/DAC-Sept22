//24. Write a Java Program to print Armstrong Numbers between 1 to 1000. 

import java.util.Scanner;
class Armstrong
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the starting range number: ");
		int a=sc.nextInt();
		System.out.print("Enter the ending range number: ");
		int b=sc.nextInt();
		Arms(a,b);
	}
	
	public static void Arms(int a, int b)
	{
		for(int i=a;i<=b;i++)
		{
			int t1=i;
			int length=0;
			while(t1!=0)
			{
				t1=t1/10;
				length=length+1;
			}
			
			int t2=i;
			int arm=0,rem;
			while(t2!=0)
			{
				rem=t2%10;
				int mul=1;
				for(int j=1;j<=length;j++)
				{
					mul=mul*rem;
				}
				arm=arm+mul;
				t2=t2/10;
			}
			if(i==arm)
			{
				System.out.print(i+" ");
			}
		}
	}
}

/*

I:\Interview Collection>javac Armstrong.java

I:\Interview Collection>java Armstrong
Enter the starting range number: 1
Enter the ending range number: 1000
1 2 3 4 5 6 7 8 9 153 370 371 407

*/