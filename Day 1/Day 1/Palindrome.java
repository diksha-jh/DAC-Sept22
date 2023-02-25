//19. Check whether the Given Number is a Palindrome or NOT.

/*import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		int reversenum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int originalNum=sc.nextInt();
		int temp=originalNum;
		while(temp!=0)
		{
			int rem=temp%10;
			reversenum=reversenum*10+rem;
			temp=temp/10;
		}
		if(originalNum==reversenum)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
	}
}*/

/*

I:\Interview Collection>javac Palindrome.java

I:\Interview Collection>java Palindrome
Enter the number:
2552
Number is palindrome

I:\Interview Collection>java Palindrome
Enter the number:
456
Number is not palindrome

*/
import java.util.Scanner;
public class Palindrome  
{  
    public static void main(String[] args)
	{  
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String string=sc.nextLine();
        boolean flag = true;  
          
        //Converts the given string into lowercase  
        string = string.toLowerCase();  
          
        //Iterate the string forward and backward, compare one character at a time   
        //till middle of the string is reached  
        for(int i = 0; i < string.length(); i++)
		{  
            if(string.charAt(i) != string.charAt(string.length()-i-1))
			{  
                flag = false;  
                break;  
            }  
        }  
        if(flag)  
            System.out.println("Given string is palindrome");  
        else  
            System.out.println("Given string is not a palindrome");  
    }  
} 

/*

I:\Interview Collection>javac Palindrome.java

I:\Interview Collection>java Palindrome
Enter the string: hemant
Given string is not a palindrome

I:\Interview Collection>java Palindrome
Enter the string: aa
Given string is palindrome

*/ 